package Lesson4;

public class Dog extends Animal{
    static int dogsCount = 0;
    final int runLimit = 500;
    final int swimLimit = 10;

    Dog(String name) {
        super(name);
        dogsCount++;
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
         if(a<=swimLimit)
             System.out.println(super.getName() + " swims " + a + " metres");
         else
             System.out.println(super.getName() + " can not swim " + a + " metres");
    }
}
