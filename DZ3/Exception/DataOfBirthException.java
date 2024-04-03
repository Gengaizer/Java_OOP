package DZ3.Exception;

public class DataOfBirthException extends IndexOutOfBoundsException {

    public DataOfBirthException(String dob) {
        super("\n Невалидные данные в значении дата рождения. попробуйте дд.мм.гггг. \n Вы Ввели: " + dob);
    }

}