package Lesson2;
//4-task
public class Text {
    public static void main(String[] args) {
        printNTimes("hello",5);
    }
    public static void printNTimes(String s, int n){
        for(int i=0;i<n;i++)
            System.out.println(s);
    }
}
