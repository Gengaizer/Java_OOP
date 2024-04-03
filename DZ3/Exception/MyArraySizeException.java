package DZ3.Exception;

public class MyArraySizeException extends IndexOutOfBoundsException {

    public MyArraySizeException(int size) {
        super("\nНеверное колличество данных! \nНеобходимо ввести (Имя) (Фамилию) (Отчество) (Дату рождения) (пол) \n колличество введеных вами данных = "
                + size);
    }

}
