package com.javaproject.funtionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCombinedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");

        // Get unique names in uppercase, sorted alphabetically
        List<String> result = names.stream()
                .distinct()  // Remove duplicates
                .filter(name -> name.length() > 3)  // Only names longer than 3 characters
                .map(String::toUpperCase)  // Convert to uppercase
                .sorted()  // Sort alphabetically
                .collect(Collectors.toList());

        System.out.println(result);  // Output: [ALICE, CHARLIE, DAVID]
    }
}
