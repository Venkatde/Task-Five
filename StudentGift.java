package com.question3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StudentGift {


       public static void main(String[] args) {
            List<String> studentNames = Arrays.asList("Anil", "Bob", "Anna", "Alex", "Charlie", "Amy", "David", "Arun", "Eve", "Andrea");

            List<String> studentsStartingWithA = studentNames.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println("Students whose names start with 'A': " + studentsStartingWithA);
        }


}
