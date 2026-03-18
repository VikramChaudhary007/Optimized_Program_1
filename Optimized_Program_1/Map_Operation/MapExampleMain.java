package Optimized_Program_1.Map_Operation;

import java.util.*;

// Main class demonstrating Stream API map() transformation
public class MapExampleMain {

    public static void main(String[] args) {

        // 1. Create a list of names
        List<String> names = Arrays.asList("Java", "Spring", "Boot");

        // 2. Transform list of Strings to list of lengths using map()
        List<Integer> lengths = names.stream()
                                     .map(String::length) // Using method reference for cleaner code
                                     .toList();           // Collect to list

        // 3. Print original list
        System.out.println("Names: " + names);

        // 4. Print transformed list
        System.out.println("Lengths: " + lengths);
    }
}