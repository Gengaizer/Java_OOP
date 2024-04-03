
// public class iskl {
// /**
// * Обработайте возможные исключительные ситуации. "Битые" значения
// * в исходном массиве считайте нулями. Можно внести в код правки,
// * которые считаете необходимыми
// */
// public class Task2 {
// public static void main(String[] args) {

// }

// private static int sum2d(String[][] arr) {
// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < 5; j++) {
// int val = Integer.parseInt(arr[i][j]);
// sum += val;
// }
// }
// return sum;
// }
// }

// 11:25

// String[][] arr = new String[][] {
// {"1", "1", "12"},
// {"1", "13", "1", "1", "1"},
// {"1", "7"},
// {"е"},
// {"2", "6"}
// };

// 11:25
// String[][] arr0 = new String[][] {
// { "1", "1", "1", "1", "1" },
// { "1", "1", "1", "1", "1" },
// { "1", "1", "1", "1", "1" },
// { "1", "1", "1", "1", "1" },
// { "1", "1", "1", "1", "1" }
// };

// }

// import java.util.InputMismatchException;
// import java.util.Scanner;

// /**
// * Изучите данный код. Все ли с ним хорошо? Если нет,
// * скорректируйте код, попробуйте обосновать свое решение.
// */
// public class Task1 {
// public static void main(String[] args) {
// run();
// }

// public static void run() {
// Scanner scanner = new Scanner(System.in);
// int[] arr = new int[10];
// System.out.println(
// "Укажите индекс элемента массива, с 0 до 9 " +
// "в который хотите записать значение 1");
// int index = 0;
// if (scanner.hasNextInt())
// index = scanner.nextInt();
// else {
// System.out.println("Индекс должен быть целым числом");
// return;
// }
// try {

// arr[index] = 1;
// System.out.println("Изменено");
// } catch (IndexOutOfBoundsException e) {
// System.err.println("Указан индекс за пределами массива");
// }
// // catch(InputMismatchException e){
// // System.out.println("Индекс должен быть целым числом");
// // }
// }

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] {
                { "1", "1", "12" },
                { "1", "13", "1", "1", "1" },
                { "1", "7" },
                { "е" },
                { "2", "6" }

        };

        System.out.println(sum2d(arr));

    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (isInteger(arr[i][j])) {
                        int val = Integer.parseInt(arr[i][j]);
                        sum += val;
                    } else
                        throw new RuntimeException("Неверные данные");
                }
            }

        } catch (NumberFormatException e) {
            throw new RuntimeException("Неверные данные");
        }
        return sum;
    }

    private static boolean isInteger(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isInteger'");
    }

}

    // private static boolean isInteger(String str) {
    // try {
    // Integer.parseInt(str);
    // return true;
    // } catch (NumberFormatException e) {
    // return false;
    // }
    // }
    // }
    // }

    // public class Task3 {

    // private static final List<String> strings = List.of("Анна=4",
    // "Елена=5",
    // "Марина=6",
    // "Полина=?",
    // "Владимир=?",
    // "Константин=?",
    // "Иван=4");
    // // для проверки, заменить какое-то из значений на null

    // public static void main(String[] args) {
    // String path = "task3.txt";
    // write(path, strings);
    // rewrite(path);
    // }

    // private static void write(String path, List<String> strings) {
    // FileWriter fileWriter = null;
    // try {
    // fileWriter = new FileWriter(path);
    // for (String string : strings) {
    // fileWriter.write(string + "\n");
    // }
    // fileWriter.flush();
    // } catch (IOException e) {
    // e.printStackTrace();
    // } finally {
    // try {
    // fileWriter.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }
    // }

    private static Map<String, Integer> analyze(String path) {
        Map<String, Integer> resultMap = new LinkedHashMap<>(7);
        BufferedReader br = null;
        int lineNumber = 1;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split("=");
                String key = arr[0];
                String temp = arr[1];
                int value;
                if (temp.equals("?"))
                    value = key.length();
                else
                    value = Integer.parseInt(temp);
                resultMap.put(key, value);
                lineNumber++;
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid data in line " + lineNumber);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultMap;
    }

    private static void rewrite(String path) {
        Map<String, Integer> data = analyze(path);
        List<String> newStrings = new ArrayList<>(7);

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            newStrings.add(entry.toString());
        }

        write(path, newStrings);
    }
}
