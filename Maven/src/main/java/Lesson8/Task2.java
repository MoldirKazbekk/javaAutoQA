package Lesson8;

public class Task2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("8777770081", "Johns");
        phoneBook.add("8777896481", "Adams");
        phoneBook.add("8773270890", "Jobs");
        phoneBook.add("8771236578", "Kennedy");
        phoneBook.add("8788881633","Johns");
        System.out.println(phoneBook.get("Johns"));
    }
}
