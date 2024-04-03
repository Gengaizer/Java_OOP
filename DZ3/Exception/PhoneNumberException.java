package DZ3.Exception;

public class PhoneNumberException extends NumberFormatException {

    public PhoneNumberException(String pn) {
        super("\nНевалидные данные в поле телефонный номер попробуйте +1234567890 \nВы ввели " + pn);
    }

}
