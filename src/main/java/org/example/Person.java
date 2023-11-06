package org.example;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Person {
    String name;
    String position;
    String email;
    String phone;
    String salary;
    int age;

    //Конструктор класса должен заполнять эти поля при создании объекта.
    public Person(String name, String position, String email,
                  String phone, String salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format(name, position, email, phone, salary, age);
    }

    public void print() {
        System.out.println(this);
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public static void main(String[] args) {
        Person manager = new Person("Ivan", "boss", "ivan-33@mail.ru",
                "375336767895", "3400 EUR", 24);
        System.out.println(manager.name);
        System.out.println(manager.position);
        System.out.println(manager.email);
        System.out.println(manager.phone);
        System.out.println(manager.salary);
        System.out.println(manager.age);

        //Создать массив из 5 сотрудников.
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Anna", "doctor", "anna-88@gmail.com",
                "798075", "287 EUR", 35);
        persArray[1] = new Person("Victor", "cook", "cook_70@yandex.ru",
                "37544890", "699 USD", 47);
        persArray[2] = new Person("Yana", "cashier", "yana@tut.by",
                "+37589083", "8099 PLN", 28);
        persArray[3] = new Person("Ilia", "pilot", "ilia.pilot@tut.com",
                "453277", "769 PLN", 66);
        persArray[4] = new Person("Kira", "teacher", "kira90@kik.vo",
                "+6670949", "9000 BYN", 49);

        //С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();
    }
}
