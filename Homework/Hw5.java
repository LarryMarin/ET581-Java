package Homework;
//Larry Marin, 23656183, Assignment 5, D-10:10am-11:50am
//I did not collaborate with anyone else on this assignment.
import java.util.Scanner;

public class Hw5 {

    // 2. Prints all elements on one line, separated by spaces, with no extra space after the last one.
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Read the length, create the array, and fill it with user input.
        Scanner userIn = new Scanner(System.in);
        System.out.print("Please enter a number for the length of the array: ");
        int n = userIn.nextInt();
        int[] userArr = new int[n];

        for (int i = 0; i < userArr.length; i++) {
            System.out.print("Please enter an integer to enter into the array: ");
            userArr[i] = userIn.nextInt();
        }

        // 2. Print the array after reading it.
        System.out.print("The array is: ");
        printArray(userArr);

        // 3. Print the index of the middle element and its value.
        // I decide the middle by using length / 2 (integer division). For an odd length
        // this is the exact middle. For an even length there are two middle elements,
        // and length / 2 picks the second (upper) one.
        int middleIndex = userArr.length / 2;
        System.out.println("The middle index is " + middleIndex
                + " and the value stored there is " + userArr[middleIndex] + ".");

        // 4. Compute and print the minimum value.
        int min = userArr[0];
        for (int i = 1; i < userArr.length; i++) {
            if (userArr[i] < min) {
                min = userArr[i];
            }
        }
        System.out.println("The minimum number in the array is " + min + ".");

        // 5. Read an integer and add it to every element of the array.
        System.out.print("Please enter a number to add to every element: ");
        int toAdd = userIn.nextInt();
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = userArr[i] + toAdd;
        }
        System.out.print("This is the array after adding " + toAdd + " to each element: ");
        printArray(userArr);

        // 6. Make a shallow copy: a NEW array of the same length with the same values.
        // (int[] copy = userArr; would NOT work, since that is just a second name
        // for the same array.)
        int[] copyArr = new int[userArr.length];
        for (int i = 0; i < userArr.length; i++) {
            copyArr[i] = userArr[i];
        }
        System.out.println("This is the first element in the copy: " + copyArr[0]);
        System.out.println("This is the last element in the copy: " + copyArr[copyArr.length - 1]);

        // 7. Add the copy to the original. The original changes, the copy does not.
        for (int i = 0; i < userArr.length; i++) {
            userArr[i] = userArr[i] + copyArr[i];
        }
        System.out.print("Original array after adding the copy to it: ");
        printArray(userArr);
        System.out.print("Copied array (unchanged): ");
        printArray(copyArr);
    }
}
