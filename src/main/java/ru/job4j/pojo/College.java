package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setName("Maria Vasileva");
        firstStudent.setGroup("6306");
        firstStudent.setAdmissionDate(new Date());
        System.out.println(firstStudent.getName() + " entered in group "
                + firstStudent.getGroup() + " in " + firstStudent.getAdmissionDate());
    }
}
