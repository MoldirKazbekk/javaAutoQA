package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumSign();
        printThreeWords();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange \nBanana \nApple");
    }
    public static void checkSumSign(){
        int a = 5;
        int b = 7;
        int c = a+b;
        if(c>=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor(){
        int value = 15;
        if(value<=0)
            System.out.println("Красный");
        else if(value<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }
    public static void compareNumbers(){
        int a = 30;
        int b = -12;
        if(a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}
