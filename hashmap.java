import java.util.*;

// import java.io.*;
public class hashmap {
    public static void main(String[] argu) {
        // Map<String,Integer>numbers=new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>(); // sorted acc to key
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println("HashMap " + numbers);

        numbers.remove("three");
        System.out.println(numbers);

        // System.out.println(numbers[one]);
        // unique key
        // numbers.put("three",33); //update
        // System.out.println("HashMap"+numbers);

        // if(!numbers.containsKey("three"))
        // {
        // numbers.put("three",33); //update
        // System.out.println("HashMap"+numbers);
        // }

        // System.out.println(numbers.containsValue(3));
        // System.out.println(numbers.isEmpty());

        // numbers.putIfAbsent("three", 33);
        // System.out.println(numbers);

        // print
        // for(Map.Entry<String, Integer>e: numbers.entrySet())
        // {
        // // System.out.println(e);
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }

        // print only key
        // for(String key:numbers.keySet())
        // {
        // System.out.println(key);
        // }

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 3);

        int count1 = map.getOrDefault("apple", 0); // Returns 5
        int count2 = map.getOrDefault("orange", 0); // Returns 0
        int count3 = map.getOrDefault("banana", 0); // Returns 3
        System.out.println(count1 + ", " + count2 + ", " + count3);


    }
}
