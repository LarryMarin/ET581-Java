package Homework.Hw7;

class Person {
    // 1. Define a class Person that represents a person. People have a name, an age. and a
    // phone number. Since people always have a name and an age, your class should have a
    // constructor that has those as parameters.
    String name;
    int age;
    String phoneNumber;

    public Person(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, int age){
        this(name, age, "None");
    }
}
