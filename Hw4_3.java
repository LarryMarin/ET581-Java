import java.util.Scanner;

public class Hw4_3 {
    public static void main(String [] args){
        // Write a program that does the following repeatedly:
        // Asks the user for three numbers.
        // If all three numbers are 0, the program should finish.
        // Otherwise, print the numbers from the first number to the second incrementing by
        // the third.
        // Repeat.
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Please enter a starting number, an ending number, and a number to increment by: ");
            int start = input.nextInt();
            int end = input.nextInt();
            int inc = input.nextInt();

            if(start == 0 && end == 0 && inc == 0){
                break;
            }

            if (inc > 0) {
                for (int i = start; i <= end; i += inc) {
                    System.out.print(i + " ");
                }
            } 
            else if (inc < 0) {
                for (int i = start; i >= end; i += inc) {
                    System.out.print(i + " ");
                }
            }
            else{
                System.out.print("The increment number cannot be 0 unless all numbers are 0.");
            }
            System.out.println();
        }
        input.close();
    }
}
