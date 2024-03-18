package com.question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

    public class AgeCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input birthdate from the user
            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
            String birthDateString = scanner.nextLine();

            // Parse the input string into a LocalDate object
            LocalDate birthdate = LocalDate.parse(birthDateString);

            // Calculate age using Period class
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(birthdate, currentDate);

            // Output the age
            System.out.println("Your age is: " + period.getYears() + " years, " +
                    period.getMonths() + " months, and " +
                    period.getDays() + " days.");

            scanner.close();
        }
    }


