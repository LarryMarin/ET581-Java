import java.util.Scanner;

public class Hw4_2 {
    public static void main(String [] args){
        // Write a program that reads an integer from the user and then prints a 'times table" for
        // the numbers from 1 to the given integer (inclusive). That is, for input n, you would print a
        // table of n rows (lines) each with n columns, where the cell at row i and column g
        // contains the value i x.). You do need separate rows, but don't worry about the columns
        // lining up nicely
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row * col + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
