package DZ3.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    public static void save(Person args, String[] data) {
        String a = "DZ3/" + data[0] + ".txt";
        System.out.println(a);
        try (FileWriter writer = new FileWriter(a, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);) {

            writer.write(args.toString());
            System.out.println("Запись прошла");

        } catch (IOException e) {
            System.out.println("Без записи");
        }

    }

}
