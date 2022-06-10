package Lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    HashMap<String, String> records;

    public PhoneBook() {
        records = new HashMap<>();
    }

    public void add(String phoneNumber, String surname) {
        records.put(phoneNumber, surname);
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (Map.Entry<String, String> record : records.entrySet()) {
            if (surname.equals(record.getValue()))
                phoneNumbers.add(record.getKey());
        }
        return phoneNumbers;
    }
}
