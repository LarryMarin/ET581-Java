import java.util.Scanner;

public class Ex5 {
    public static void main(String [] args){
        double n = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number ");
        n = input.nextDouble();
        n *= n;
        System.out.println("The square of n is " + n);
        input.close();
    }
}
