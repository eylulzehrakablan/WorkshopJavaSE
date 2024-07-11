package com.eylulzehrakablan.oop.abstractx;

abstract public class Person {

    // Variable
    private String name;
    private String surname;

    // Parametresiz Constructor
    public Person() {
    }

    // Parametreli Constructor
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    // Method

    // Gövdeli method
    public void govdeliMethod(String data){
        System.out.println(data);
    }

    // Gövdesiz method
    abstract public void govdesizMethod();

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}