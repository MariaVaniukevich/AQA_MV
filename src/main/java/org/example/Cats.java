package org.example;

public class Cats {
    public String name;
    public int appetite;
    public boolean sitost;

    public Cats(String name, int appetite, boolean sitost) {
        this.name = name;
        this.appetite = appetite;
        this.sitost = sitost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getSitost() {
        return sitost;
    }

    public void setSitost(boolean sitost) {
        this.sitost = sitost;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}