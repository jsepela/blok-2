package org.example;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public abstract void move();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }

    public void move() {
        System.out.println("The dog is walking.");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Chirp!");
    }

    public void move() {
        System.out.println("The bird is flying.");
    }
}
