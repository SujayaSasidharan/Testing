package com.javaFaker.service;

import com.github.javafaker.Faker;

public class NameFaker {
    public static void main(String[] args){


        Faker faker=new Faker();

        String name=faker.name().name();
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();
        String fullName=faker.name().fullName();
        String nameWithMiddle=faker.name().nameWithMiddle();
        String prefix= faker.name().prefix();
        String suffix=faker.name().suffix();
        String title=faker.name().title();


        System.out.println("FirstName:"+ firstName);
        System.out.println("LastName:"+ lastName);
        System.out.println(" FullName:"+ fullName);
        System.out.println(" Name:"+ name);
        System.out.println(" Name With Middle:"+ nameWithMiddle);
        System.out.println(" Prefix:"+ prefix);
        System.out.println(" Suffix:"+ suffix);
        System.out.println(" title:"+ title);



    }




}
