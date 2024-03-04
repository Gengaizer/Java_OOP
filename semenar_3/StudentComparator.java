package semenar_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student t1, Student t2) {

        return t1.getGrade().compareTo(t2.getGrade());
    }
}
