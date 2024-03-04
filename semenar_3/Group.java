package semenar_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student> {
    private ArrayList<Student> students;
    private Integer size;

    public Group(ArrayList<Student> students) {
        this.students = students;
        this.size = students.size();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Integer getSize() {
        return students.size();
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(students);
    }
}