package org.example;

public class Dog extends Animal {
    final int MAXRUN = 500;
    final int MAXSWIM = 10;
    public static int dogsCount = 0;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    @Override
    public void run(int dlina) {
        if (dlina > 0 && dlina <= MAXRUN) {
            System.out.println("Собака " + name + " пробежала " + dlina + " метров!");
        } else {
            System.out.println("Собака " + name + " не сможет пробежать " + dlina + " метров!");
        }
    }

    @Override
    public void swim(int dlina2) {
        if (dlina2 > 0 && dlina2 <= MAXSWIM) {
            System.out.println("Собака " + name + " проплыла " + dlina2 + " метров!");
        } else {
            System.out.println("Собака " + name + " не сможет проплыть " + dlina2 + " метров!");
        }
    }
}
