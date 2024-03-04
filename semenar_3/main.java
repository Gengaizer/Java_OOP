package semenar_3;

import java.util.*;

/**
 * - Создать класс Студент
 * - Создать класс УчебнаяГруппа
 * - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс
 * Iterator
 * - Реализовать его контракты
 *
 *
 *
 *
 * - Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
 * - Реализовать контракт compareTo () со сравнением по какому-либо параметру
 * (пример studentId)
 *
 *
 *
 * - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
 * - Реализовать контракт compare () со сравнением по какому-либо параметру
 * (пример: сочетание Имя+Фамилия)
 */
public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Q", 20, 3);
        Student s2 = new Student("A", 22, 2);
        Student s3 = new Student("Z", 24, 5);
        Student s4 = new Student("E", 21, 2);
        Student s5 = new Student("Q", 26, 4);
        Student s6 = new Student("L", 22, 1);
        Student s7 = new Student("D", 21, 9);
        Student s8 = new Student("Y", 21, 7);
        ArrayList<Student> student1 = new ArrayList<>(List.of(s1, s2, s3));
        ArrayList<Student> student2 = new ArrayList<>(List.of(s4, s5));
        ArrayList<Student> student3 = new ArrayList<>(List.of(s4, s5, s7, s8));
        ArrayList<Student> student4 = new ArrayList<>(List.of(s1, s5, s6, s7, s8));

        Group group = new Group(student1);
        Group group2 = new Group(student2);
        Group group3 = new Group(student3);
        Group group4 = new Group(student4);
        ArrayList<Group> groups = new ArrayList<>(List.of(group2, group));
        ArrayList<Group> groups2 = new ArrayList<>(List.of(group3, group4, group));
        Flow flow = new Flow(groups);
        Flow flow2 = new Flow(groups2);
        student1.sort(new StudentComparator());
        student2.sort(new StudentComparator());
        student3.sort(new StudentComparator());
        student4.sort(new StudentComparator());

        // for (Group groupsGroup : groups) {
        // System.out.println(groupsGroup);

        // }
        System.out.println(flow.compareTo(flow2));
        Iterator<Group> iterator = flow.iterator();
        while (iterator.hasNext()) {
            Group groupPrint = iterator.next();

            System.out.printf("Размер группы %d \n Cписок студентов группы %s \n", groupPrint.getSize(),
                    groupPrint.getStudents());
        }
    }

}