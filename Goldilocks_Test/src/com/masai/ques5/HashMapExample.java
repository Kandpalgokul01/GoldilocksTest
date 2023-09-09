package com.masai.ques5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        // Storing values in the HashMap
        ageMap.put("Ram", 36);
        ageMap.put("Shyam", 60);

     // Printing both name and age using entrySet
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

}


