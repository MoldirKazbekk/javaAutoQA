package Lesson1;
import java.util.*;
public class A {
    public void show(){
        System.out.println("A");
    }
    public static void main(String[] args){
        System.out.println(Arrays.binarySearch(new int[]{1, 2, 3, 4, 5, 8, 8, 8}, 8));;
    }
}
class B extends A{
    public void show(){
        System.out.println('B');
    }
}
