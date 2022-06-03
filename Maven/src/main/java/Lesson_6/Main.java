package Lesson_6;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        array[0] = new String[]{"1","2","3","4"};
        array[1] = new String[]{"5","6","7","8"};
        array[2] = new String[]{"s","10","5","98"};
        array[3] = new String[]{"45","66","87","18"};
        try {
           // Task1.method1(new String[4][2]);
            Task1.method1(array);
        }
        catch (MyArraySizeException exception) {
            System.out.println("The size is wrong");
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
