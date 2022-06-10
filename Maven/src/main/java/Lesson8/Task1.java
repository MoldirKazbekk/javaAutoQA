package Lesson8;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] array = {"hello", "world", "work", "java", "apple", "hello", "work", "orange", "java", "apple"};
        HashSet<String> uniqueSet = new HashSet<>(Arrays.asList(array));
        System.out.println(uniqueSet);
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : array) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(countMap);
    }
}
