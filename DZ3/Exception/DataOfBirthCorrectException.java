package DZ3.Exception;

public class DataOfBirthCorrectException extends NumberFormatException {

    public DataOfBirthCorrectException() {
        super("Невалидные данные: дата рождения");
    }

}