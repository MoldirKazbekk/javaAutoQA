package Lesson_5;

public class Task1 {

    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "hello";
        array[1] = "world";
        array[2] = "!";
        wrapElements(array);
        for(String a:array){
            System.out.println(a);
        }
    }

    public static <T> void wrapElements(T[] array){
        T temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
