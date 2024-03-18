package com.question1;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class Main {
        public static void main(String[] args) {
            List<String> names = Stream.of("aBc", "d", "ef")
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            System.out.println("Uppercase names: " + names);
        }
    }


