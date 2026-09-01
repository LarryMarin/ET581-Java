import java.util.Scanner;

public class Ex6 {
    public static void main(String [] args){
        int myInt = 0;
        double myDouble = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        myInt = input.nextInt();
        
        myDouble = (double) myInt/10;

        System.out.println(myInt + " divided by 10 is equal to: " + myDouble);
    }
}
