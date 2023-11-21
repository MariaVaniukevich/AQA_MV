package org.example.lesson9;

                                //смогла решить только так
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class EnteringLogins {
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логины (пустая строка для завершения):");

        while (true) {
            String login = scanner.nextLine();

            if (login.isEmpty()) {
                break;
            }

            logins.add(login);
        }

        System.out.println("Логины, начинающиеся на букву 'f':");

        for (String login : logins) {
            if (login.startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}