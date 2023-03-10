package org.person;

public class Example {
    public static void main(String[] args){
        Person a = new Person();
        System.out.println(a.name);
        System.out.println(a.surname);
        System.out.println(a.age);
        System.out.println(Person.yearOfBirth);

        Person.yearOfBirth = 1997;
    }


}
