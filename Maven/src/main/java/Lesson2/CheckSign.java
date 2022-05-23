package Lesson2;
//2-task
public class CheckSign {
    public static void main(String[] args) {
        signCheck(15);
    }
     public static void signCheck(int a){
        if(a>=0)
            System.out.println("positive");
        else
            System.out.println("negative");
    }
}
