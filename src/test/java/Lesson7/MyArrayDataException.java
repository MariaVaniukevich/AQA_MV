package Lesson7;

public class MyArrayDataException extends CustomException {

    public MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные в ячейке [%d, %d]", row, col));
    }
}