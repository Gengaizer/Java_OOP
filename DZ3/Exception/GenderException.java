package DZ3.Exception;

public class GenderException extends IllegalArgumentException {
    public GenderException(String gender) {
        super("\nНевалидные данные в пол.Попробуйте ввести m/f \n Вы ввели:" + gender);
    }

}
