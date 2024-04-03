package DZ3.viev;

import DZ3.model.dataScaner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Ввведите данные: (Фамилия) (Имя) (Отчество) (Дату рождения) (пол)\nВ формате: (Фамилия)(Имя)(Отчество)(дд.мм.гггг)(+1234567890)(f/m)");
        dataScaner test = new dataScaner();
        test.main();

    }

}
