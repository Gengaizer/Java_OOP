package DZ3.model;

public class Person {
    String firstName;
    String surname;
    String patronymic;
    String dateOfBirth;
    String phoneNumber;
    String gender;

    public Person(String surname, String firstName, String patronymic, String dateOfBirth, String phoneNumber,
            String gender) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", surname, firstName, patronymic, dateOfBirth, phoneNumber,
                gender);
    }
}
