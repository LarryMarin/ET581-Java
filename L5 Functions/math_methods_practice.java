import java.util.Scanner;

public class math_methods_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double userIn = input.nextInt();
        System.out.println("Square root of "+ userIn + " is: " + Math.sqrt(userIn));
        System.out.println("Third root: " + userIn + " is: " + Math.cbrt(userIn));
        System.out.println("Fourth root: " + userIn + " is: " + Math.sqrt(Math.sqrt(userIn)));

        input.close();
    }
}
