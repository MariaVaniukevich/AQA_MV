package Lesson7;

public class MyArraySizeException extends CustomException {

    public MyArraySizeException() {
        super("Размер матрицы должен быть 4x4");
    }
}