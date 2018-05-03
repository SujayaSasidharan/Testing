package com.javaFaker.service;

import com.github.javafaker.Faker;

public class BookFaker {
    public static void main(String[] args){


        Faker faker=new Faker();

        String author=faker.book().author();
        String title=faker.book().title();
        String publisher=faker.book().publisher();
        String genre=faker.book().genre();

        System.out.println("Author:"+ author);
        System.out.println("Title:"+ title);
        System.out.println("Publisher:"+ publisher);
        System.out.println("Genre:"+ genre);

    }
}
