package org.example;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void dobavFood(int m) {
        food += m;
    }

    public void info() {
        System.out.println("plate: " + getFood());
    }
}
