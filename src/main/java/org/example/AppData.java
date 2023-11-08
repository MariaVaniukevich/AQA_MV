package org.example;

import java.io.*;



public class AppData {
    private static String[] header = new String[]{"Value 1", "Value 2", "Value 3"};
    private static int[][] data = new int[][]{{100, 200, 123}, {300, 400, 500}};

    public static void record() {
        try (FileWriter filewriter = new FileWriter("Test.csv", false)) {
            for (int i = 0; i < header.length; i++) {
                filewriter.write(header[i] + ";");
            }
            filewriter.write("\n");
            System.out.println("Записали массив String");
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    String s = Integer.toString(data[i][j]);
                    filewriter.write(s + ";");
                }
                filewriter.write("\n");
            }
            System.out.println("Записали массив int");
            filewriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reading() {
        byte[] buf = new byte[20];
        try (FileInputStream reader = new FileInputStream("test.csv")) {
            int count;
            System.out.println("Считываем данные из файла test.csv:");
            while ((count = reader.read(buf)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        record();
        reading();
    }
}
