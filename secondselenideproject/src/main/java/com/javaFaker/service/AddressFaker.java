package com.javaFaker.service;

import com.github.javafaker.Faker;

public class AddressFaker {

    public static void main(String[] args){


        Faker faker=new Faker();

        String streetName=faker.address().streetName();
        String streetAddressNumber=faker.address().streetAddressNumber();
        String streetAddress=faker.address().streetAddress();
        String secondaryAddress=faker.address().secondaryAddress();
        String zipCode=faker.address().zipCode();
        String streetSuffix=faker.address().streetSuffix();
        String citySuffix=faker.address().citySuffix();
        String  cityPrefix=faker.address(). cityPrefix();
        String city=faker.address().city();
        String cityName=faker.address().cityName();
        String state=faker.address().state();
        String firstName=faker.address().firstName();
        String lastName=faker.address().lastName();
        String country=faker.address().country();

        System.out.println("streetName:"+ streetName);
        System.out.println("streetAddressNumber:"+ streetAddressNumber);
        System.out.println("streetAddress:"+ streetAddress);
        System.out.println("secondaryAddress:"+ secondaryAddress);
        System.out.println("zipCode:"+ zipCode);
        System.out.println("streetSuffix:"+ streetSuffix);
        System.out.println("citySuffix:"+ citySuffix);
        System.out.println("cityPrefix:"+ cityPrefix);
        System.out.println("city:"+ city);
        System.out.println("cityName:"+ cityName);
        System.out.println("state:"+ state);
        System.out.println("firstName:"+ firstName);
        System.out.println("lastName:"+ lastName);
        System.out.println("country:"+ country);

    }
}

