package FinalTuskOop.viev;

import java.util.Scanner;

public class Viev {
    Scanner in = new Scanner(System.in);

    public double getVar(String variable) {
        System.out.printf("%s", variable);
        return in.nextDouble();
    }

    public char getAction(String string) {
        System.out.printf("%s", string);
        Character act = in.next().charAt(0);
        return act;
    }

    public void print(String data, String title) {
        System.out.printf("%s %s\n", title, data);
    }

}
