package semenar_5.controller;

import java.util.ArrayList;
import java.util.List;

import semenar_5.model.Student;
import semenar_5.model.Teacher;
import semenar_5.model.User;
import semenar_5.view.StudentView;

public class DataService {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private StudentView studentView = new StudentView();

    public DataService() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void create(User user) {
        if (user instanceof Student) {
            int id = students.size();
            Student student = new Student(user.getName(), user.getAge());
            student.setId(id + 1);
            students.add(student);
        } else if (user instanceof Teacher) {
            Teacher teacher = new Teacher(user.getName(), user.getAge(), List.of("Math", "Phisics"));
            teachers.add(teacher);
        }

    }

    public void read(boolean bool) { // true student
        if (bool) {
            System.out.println(students);
        } else if (!bool) {
            System.out.println(teachers);
        }
    }

    public void id(int id) {
        studentView.stuCheck(students, id);

    }
}