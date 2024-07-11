package com.eylulzehrakablan.oop.abstractx;

public class MainTest {
    public static void main(String[] args) {

        Person person = new Student(); // polymorphism
        person.setName("Person name-1");
        person.setSurname("Person surname-1");
        System.out.println(person);
        person.govdeliMethod("Person 44");

        System.out.println("***************");

        Student student = new Student();
        student.setName("Student name-1");
        student.setSurname("Student surname-1");
        System.out.println(student);
        student.govdeliMethod("Student 44");

        System.out.println("***************");

        Teacher teacher = new Teacher();
        teacher.setName("Teacher name-1");
        teacher.setSurname("Teacher surname-1");
        System.out.println(teacher);
        teacher.govdeliMethod("Teacher 44");
    }
}