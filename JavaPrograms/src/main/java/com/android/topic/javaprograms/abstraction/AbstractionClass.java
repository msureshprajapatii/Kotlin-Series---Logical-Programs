package com.android.topic.javaprograms.abstraction;

public class AbstractionClass extends Animal {

    public static void main(String[] args) {

        AbstractionClass animal = new AbstractionClass();

        animal.eat();
        animal.run();

    }

    @Override
    void eat() {
        System.out.println("eating");
    }

    @Override
    void run() {
        System.out.println("runing");
    }
}

abstract class Animal {

    abstract void eat();

    abstract void run();

}
