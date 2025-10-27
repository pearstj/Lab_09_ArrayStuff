//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

class main_ {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Task 1: Declare array
        int[] dataPoints = new int[100];

        // Task 2: Fill array with random values
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display all values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            if (i < dataPoints.length - 1) {
                System.out.print(dataPoints[i] + " | ");
            } else {
                System.out.print(dataPoints[i]);
            }
        }
        System.out.println();
        System.out.println();

        // Task 4: Calculate sum and average
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        System.out.println();

        // Task 5 & 6: Get user input and count occurrences
        int userValue = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter a value between 1 and 100: ");
            if (scnr.hasNextInt()) {
                userValue = scnr.nextInt();
                if (userValue >= 1 && userValue <= 100) {
                    valid = true;
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scnr.next();
            }
        }

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");
        System.out.println();

        // Task 7: Find first occurrence of user value
        int searchValue = 0;
        valid = false;
        while (!valid) {
            System.out.print("Enter another value between 1 and 100: ");
            if (scnr.hasNextInt()) {
                searchValue = scnr.nextInt();
                if (searchValue >= 1 && searchValue <= 100) {
                    valid = true;
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scnr.next();
            }
        }

        int position = -1;
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                position = i;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The value " + searchValue + " was found at array index " + position);
        } else {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }
        System.out.println();

        // Task 8: Find min and max
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
        System.out.println();

        // Task 9: Call getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    } // end of main method

    // Task 9: getAverage method (static method after main)
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return (double) sum / values.length;
    }

}