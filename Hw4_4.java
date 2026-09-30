import java.util.Scanner;

public class Hw4_4 {
    public static void main(String [] args){
        // 4. The alternating harmonic series is the following:
        // 1/1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 ...
        // Write a program that asks the user for a number n and then calculates and prints the
        // sum of the first n terms of the sequence. Try your program with a equal to 10, 100, and
        // 1000. Compare to the value of Math.log (2). Hints: You'll need to use a double for the
        // sum, and be sure you don't use integer division for the individual terms. You'll also need
        // to switch between addition and subtraction. I can think of two ways (one using a
        // variable that changes value and one using a conditional).
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        double sum = 0;
        double sign = 1;

        for (int i = 1; i <= n; i++) {
            sum += sign / i;
            sign = -sign;
        }

        System.out.println("Sum of first " + n + " terms: " + sum);
        System.out.println("Math.log(2): " + Math.log(2));

        input.close();
    }
}
