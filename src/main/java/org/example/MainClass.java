package org.example;

public class MainClass {
    public static void creatCatsPlate() {
        int dobavka = 500;
        Cats[] arrCats = new Cats[3];
        arrCats[0] = new Cats("Петя", 10, false);
        arrCats[1] = new Cats("Вася", 100, false);
        arrCats[2] = new Cats("Кузя", 80, false);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < arrCats.length; i++) {
            if (arrCats[i].getSitost() == false && arrCats[i].getAppetite() <= plate.getFood()) {
                arrCats[i].eat(plate);
                arrCats[i].sitost = true;
                System.out.println("Кот " + arrCats[i].getName() + " наелся.");
            } else if (arrCats[i].getSitost() == false && arrCats[i].getAppetite() > plate.getFood()) {
                System.out.println("Кот " + arrCats[i].getName() + " не поел.");
                System.out.println("Добавим еду!");
                plate.dobavFood(dobavka);
                plate.info();
                if (arrCats[i].getAppetite() <= plate.getFood()) {
                    System.out.println("Добавки хватило. Кот поел.");
                }
            }
        }
        plate.info();
    }

    public static void main(String[] args) {
        creatCatsPlate();
    }
}