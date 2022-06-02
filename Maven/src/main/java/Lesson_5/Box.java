package Lesson_5;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    ArrayList<T> fruits;
    public Box(){
        fruits = new ArrayList<T>();
    }
    public double getWeight(){
        double total = 0;
        if(fruits.get(0) instanceof Orange)
            total = fruits.size()*Orange.weight;
        else
            total = fruits.size()*Apple.weight;
        return total;

    }
    public boolean compare(Box<?> box2){
        return this.getWeight()== box2.getWeight();
    }
    public void add(T fruit){
        fruits.add(fruit);
    }
    public void moveTo(Box<T> box2){
        for(T fruit : fruits){
            box2.add(fruit);
        }
        this.fruits.clear();

    }
}
