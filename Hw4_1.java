import java.util.Scanner;

public class Hw4_1 {
    public static void main(String [] args){
        // Write a program that uses a do-while loop to print the squares of numbers read from
        // the user until they enter the number 0. Do not print the final square of 0 (hint: use a
        // nested control structure)
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        do{
            if(userInput==0){
                break;
            }
            else{
                System.out.println(userInput*userInput);
                System.out.print("Please enter a number: ");
                userInput = input.nextInt();
            }
        }while(userInput!=0);

        input.close();
    }
}
