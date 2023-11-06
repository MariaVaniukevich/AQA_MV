package org.example;

public class Pets {
    public static void colichestvo() {
        System.out.println("Всего " + Cat.catsCount + " кота!");
        System.out.println("Всего " + Dog.dogsCount + " собаки!");
        System.out.println("Всего " + (Cat.catsCount + Dog.dogsCount) + " животных!");
    }

    public static void zveri() {
        Cat cat1 = new Cat("Барсик");
        cat1.run(500);
        cat1.swim(3);
        Cat cat2 = new Cat("Пушок");
        cat2.swim(0);
        cat2.run(50);
        Cat cat3 = new Cat("Васька");
        cat3.run(200);
        cat3.swim(500);
        Dog dog1 = new Dog("Рэкс");
        dog1.run(450);
        dog1.swim(5);
    }

    public static void main(String[] args) {
        zveri();
        colichestvo();
    }
}