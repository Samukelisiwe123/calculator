package com.employees.api.Models;

public class Car {

    String brand;
    int year;
    double price;
    boolean isManual;

    public Car(String brand, int year, double price, boolean isManual){

        this.brand=brand;
        this.year = year;
        this.price=price;
        this.isManual=isManual;
    }

    public void displayInfo(){
        System.out.println("Brand name " + brand);
        System.out.println("Year manufactured" +year);
        System.out.println("Price: R" + price);
        System.out.println("Is the car manual"+isManual);


    }


}
