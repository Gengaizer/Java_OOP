package DZ3.presenter;

import DZ3.Exception.DataOfBirthCorrectException;
import DZ3.Exception.DataOfBirthException;
import DZ3.Exception.GenderException;
import DZ3.Exception.MyArraySizeException;
import DZ3.Exception.PhoneNumberException;

public class ValidData {
    public void valid(String[] args) {
        if (args.length != 6) {
            throw new MyArraySizeException(args.length);
        } else if (args.length == 6) {
            String dob = args[3];
            String pn = args[4];

            pn = pn.replace("+", "");
            dob = dob.replace(".", "");

            String regex = "\\d+";

            int dobLenght = dob.length();

            if (dobLenght != 8) {
                throw new DataOfBirthException(dob);
            } else if (dob.matches(regex) == false) {
                throw new DataOfBirthCorrectException();
            } else if (pn.matches(regex) == false || pn.length() != 10) {
                throw new PhoneNumberException(args[4]);
            } else if (!args[5].equals("m") && !args[5].equals("f")) {
                throw new GenderException(args[5]);
            }

        }

    }

}
