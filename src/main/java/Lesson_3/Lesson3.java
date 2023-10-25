package Lesson_3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        isSum(17, 3);
        isPositNegat(-8);
        System.out.println(isPosNeg(-9));
        isTask();
        System.out.println(isLeapYear(2000));


        // 7 задача
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }

        // 6 задача

        int[] arr = {0, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        System.out.println(Arrays.toString(arr));

        // 8 задача

        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] < 6)
                arr1[i] = arr1[i] * 2;
        System.out.println(Arrays.toString(arr1));

        // 10 задача

        int[][] arra = new int[4][4];
        for (int i = 0; i < arra.length; i++) {
            for (int j = 0, x = arra[i].length - 1; j < arra[i].length; j++, x--) {
                if (i == j || i == x) arra[i][j] = 1;
                else arra[i][j] = 0;
                System.out.print(arra[i][j] + " ");
            }
            System.out.print("\n");
        }

        // 11 задача Не решила :(

    }

    // 1 задача
    public static void isSum(int a, int b) {
        int c = a + b;
        if ((c >= 10) && (c <= 20)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 2 задача
    public static void isPositNegat(int d) {
        if (d >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    // 3 задача
    public static boolean isPosNeg(int e) {
        if (e < 0) {
            return true;
        } else {
            return false;
        }
    }

    // 4 задача
    public static void isTask() {
        int e = 4;
        String str = "Halloween";
        for (int i = 0; i < e; i++) {
            System.out.println(str);
        }
    }

    // 5 задача
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
