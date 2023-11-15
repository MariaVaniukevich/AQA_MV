package Lesson7;

public class TaskException {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"8", "2", "3", "0"},
                {"3", "8", "5", "0"},
                {"5", "8", "7", "7"},
                {"0", "7", "7", "44"}
        };
        String[][] wrongSizeMatrix = {
                {"8", "2", "3", "1"},
                {"6", "1"},
                {"0", "8", "8", "3"},
                {"0", "2", "8", "1"}
        };
        String[][] wrongChar = {
                {"3", "2", "3", "3"},
                {"6", "1", "7", "3"},
                {"0", "6", "в", "3"},
                {"0", "2", "7", "3"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }

        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}