import java.util.Scanner;

public class Hw3 {
    public static void main(String [] args){
        //1. Write a program that asks the user for a number and then uses a while statement to print the first ten multiples of that number.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userIn = input.nextInt();
        int count = 1;
        while(count<=10){
            System.out.println(userIn + " * " + count + " = " + userIn*count);
            count++;
        }

        //2. Rewrite your program to use a for statemen

        System.out.print("Please enter a new number: ");
        userIn = input.nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println(userIn + " * " + i + " = " + userIn*i);
        }

        //3. Write a program that uses a loop to print every third number starting with 1 and ending before reaching 100.
        for(int i = 1; i<100; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
        //4. Write a program that asks the user for a number, then uses a loop to count down from that number to 0, printing all the numbers from the user's number to 0 Inclusive.
        System.out.print("Please enter number: ");
        userIn = input.nextInt();
        System.out.println("Starting countdown: ");
        for(int i = userIn; i>=0; i--){
            System.out.println(i);
        }

        //5. Write a program that reads numbers from the user until they enter the number 0, at which point it prints out the sum of the numbers they entered.

        System.out.print("Enter a number: ");
        userIn = input.nextInt();
        int sum = 0;
        while(userIn!=0){
            sum+=userIn;
            System.out.print("Enter a number: ");
            userIn = input.nextInt();
        }
        System.out.println("The total of all numbers is: " + sum);

        // 6. Write a program that reads words from the user until they enter the word "stop", at which point it prints out all the words entered on one line separated by spaces. 
        // Use Strinq.equals to test whether two Strings are the same.
        String allWords = "";

        System.out.print("Please enter a word: ");
        String userStr = input.next();

        while (!userStr.equals("stop")) {
            allWords += userStr + " ";
            System.out.print("Please enter a word: ");
            userStr = input.next();
        }

        System.out.println(allWords.trim());

        input.close();
    }
}