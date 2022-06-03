package Lesson_6;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(String s){
        super(s);
    }
    public MyArrayDataException(int i, int j){
        super("row: " + i + " column: " + j + " - wrong symbols");
    }
}
