import java.util.Scanner;
public class IfElsePractice {
    public static void main(String [] args){
        //Q6
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int userInt = input.nextInt();
        
        if(userInt%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        //Q7
        System.out.print("Please enter an integer: ");
        userInt = input.nextInt();
        if(userInt%5!=0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        //Q8
        System.out.print("Please enter an integer: ");
        userInt = input.nextInt();
        if(userInt%3==0 && userInt%7!=0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        //Q9
        System.out.print("Please enter an integer: ");
        userInt = input.nextInt();

        if(userInt%5 == 0 && userInt%3 == 0){
            System.out.println(userInt + " is a multiple of 5.");
            System.out.println(userInt + " is a multiple of 3.");
        }

        // System.out.print("Do you wish to go to the movies (1/0)?");
        // int intA = input.nextInt();
        // System.out.print("Do you wish to go to dinner (1/0)?");
        // int intB = input.nextInt();

        // boolean a;
        
        input.close();
    }
}
