package DZ3.model;

import java.util.Scanner;

import DZ3.presenter.ValidData;

public class dataScaner {

    public void main() {

        Scanner dataScanner = new Scanner(System.in);
        String data = dataScanner.nextLine();
        String[] dataPerson = data.split(" ");
        ValidData personNew = new ValidData();
        personNew.valid(dataPerson);
        Person test = new Person(dataPerson[0], dataPerson[1], dataPerson[2], dataPerson[3], dataPerson[4],
                dataPerson[5]);
        SaveFile.save(test, dataPerson);
        dataScanner.close();
    }

}
