package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2010);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        myCar.setMake("Ford");
        myCar.setModel("Mustang");
        myCar.setYear(2022);

        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

    }
}