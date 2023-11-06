package org.example;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int dlina);

    public abstract void swim(int dlina2);
}