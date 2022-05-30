package Lesson4;

public class Cat extends Animal{
    final int runLimit = 200;
    static int catsCount = 0;
    private boolean satiety =false; // сытость
    private int appetite;

    public Cat(String name, int appetite){
        super(name);
        this.appetite = appetite;
        catsCount++;
    }

    @Override
    public void run(int a) {
        if(a<=runLimit)
            System.out.println(super.getName() + " runs " + a + " metres");
        else
            System.out.println(super.getName() + " can not run " + a + " metres");
    }

    @Override
    public void swim(int a) {
        System.out.println(" Cats can not swim ");
    }
    public void eat(Plate plate){
        satiety = plate.decreaseFood(this.appetite);
    }
    public boolean getSatiety(){
        return satiety;
    }
}
abstract class Animal{
    private String name;
    static int animalsCount = 0;
    Animal(String name){
        this.name = name;
        animalsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run(int a);
    public abstract void swim(int a);
}

class Plate{
    private int mass;
    public Plate(int m){
        mass = m;
    }
    public boolean decreaseFood(int m){
        if(mass-m>=0) {
            mass -= m;
            return true;
        }else
            return false;
    }
    public void increaseFood(int m){
        mass+=m;
    }
    public void info() {
        System.out.println("plate: " + mass);
    }

}