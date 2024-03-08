package semenar_5.view;

import java.util.ArrayList;

import semenar_5.model.Student;

public class StudentView {
    public StudentView() {

    }

    public void stuCheck(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }

    }

}
