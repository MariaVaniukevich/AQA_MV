package org.example;

public class Cat extends Animal {
    final int MAXRUN = 200;
    final int MAXSWIM = 0;
    public static int catsCount = 0;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int dlina) {
        if (dlina > 0 && dlina <= MAXRUN) {
            System.out.println("Кот " + name + " пробежал " + dlina + " метров!");
        } else {
            System.out.println("Кот " + name + " не сможет пробежать " + dlina + " метров!");
        }
    }

    @Override
    public void swim(int dlina2) {
        if (dlina2 >= 0 && dlina2 < 0) {
        }
    }
}
