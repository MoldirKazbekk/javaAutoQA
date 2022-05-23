package Lesson3;

public class Person {
    private String name, position, email, phone;
    private int salary, age;
    public Person(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInformation(){
        System.out.println("My name is " + name + ", " + age + " years old, position - " + position + ",\n"
         + "email - " + email + ", phone - " + phone + ", "
         + "salary is " + salary);
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        Person[] people = new Person[5];
        people[0] = new Person("John", "software engineer","John@gmail.com", "7845818852",1200000,45);
        people[1] = new Person("Kelvin", "Devops engineer","Kelvin@gmail.com", "787894642",1285000,32);
        people[2] = new Person("Ann", "consultant","Ann@gmail.com", "789465132",1100000,25);
        people[3] = new Person("Jersey", "hr manager","Jersey@gmail.com", "7898754252",980000,33);
        people[4] = new Person("Azamat", "founder","Azamat@gmail.com", "6548798852",6500000,48);
        for(int i=0;i< people.length;i++){
            if(people[i].getAge()>40)
                people[i].printInformation();
        }
    }
}
