package Lesson2;
//1-task
public class CheckSum {
    public static void main(String[] args) {
        System.out.println(checkSum(10,12));
    }
    public static boolean checkSum(int a, int b){
        if(a+b>10 && a+b<=20)
            return true;
        else
            return false;
    }
}
