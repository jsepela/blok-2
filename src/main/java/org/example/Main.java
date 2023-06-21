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
//2.1.2
        Rectangle rectangle = new Rectangle(4.5, 3.2);
        double area = rectangle.getArea();
        System.out.println("Area: " + area);

//2.2.1
        Dog dog = new Dog("Buddy", 5);
        Bird bird = new Bird("Tweetie", 2);

        dog.makeSound();
        dog.move();

        bird.makeSound();
        bird.move();
    }
}