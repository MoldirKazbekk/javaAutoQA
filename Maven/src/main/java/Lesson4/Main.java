package Lesson4;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[6];
        Plate plate = new Plate(45);
        cats[0] = new Cat("A", 10);
        cats[1] = new Cat("B", 8);
        cats[2] = new Cat("C", 25);
        cats[3] = new Cat("D", 6);
        cats[4] = new Cat("E", 11);
        cats[5] = new Cat("F", 9);
        for(Cat cat: cats){
            cat.eat(plate);
            System.out.println(cat.getSatiety());
        }
        plate.info();
    }
}
