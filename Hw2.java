//Larry Marin, 23656183, Assignment 2, D-10:10am-11:50am
//I did not collaborate with anyone else on this assignment.

import java.util.Scanner;
public class Hw2 {
    public static void main(String [] args){
        
        //Q1 Write a program that declares an Integer (int) variable named secret and sets it to
        //some constant (literal) value. Then read an integer from the input and print "You're a
        //winner!" if the value is equal to the secret.
        int secret = 14;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");
        int userInput = input.nextInt();
        if(secret==userInput){
            System.out.println("You are a winner!");
        }
        else{
            System.out.println("Sorry that is not the secret number.");
        }

        //Q2 Write a program that reads a number and reports whether or not it is a multiple of 5
        System.out.print("Please enter an integer: ");
        userInput = input.nextInt();

        if(userInput%5==0){
            System.out.println(userInput + " is a multiple of 5");
        }
        else{
            System.out.println(userInput + " is not a multiple of 5");
        }

        /*
        Q3 Write a program that reads a number from its input and outputs whether the number
        is positive, negative, or zero. Use proper if-else syntax to avoid repeating conditions and
        make the program as clear as possible
        */
        System.out.print("Please enter an integer: ");
        userInput = input.nextInt();

        if(userInput > 0){
            System.out.println("Your number is a positive number.");
        }

        else if(userInput < 0){
            System.out.println("Your number is a negative number.");
        }

        else{
            System.out.println("Your number is 0.");
        }
        /*
        Q4 Write a program that asks the user for their age, then uses the following table to
        decide what to say:
        less than 13 ———You’re just a kid
        less than 20 ——— You're a teenager!
        less than 30 ——— You're getting older...
        30 or more ——— You're over the hi
        */
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if(age >= 0 && age <= 13){
            System.out.println("You're just a kid.");
        }
        
        else if(age > 13 && age < 20){
            System.out.println("You're a teenager!");
        }

        else if(age >= 20 && age < 30){
            System.out.println("You're getting older...");
        }

        else if(age >= 30){
            System.out.println("You're over the hill.");
        }
        
        /*
        Q5 Write a program that first asks the user to enter 1 if they want to discuss sports or 2 to
        discuss food. Then if they choose sports, ask if they play ice hockey. If so, output
        “Awesome!”, otherwise output "You should try it some day.” If they choose food, ask
        how many times they ate pizza last week. If it's more than five, tell them they need to
        eat better, otherwise tell them 'OK.
        */
        System.out.print("Enter 1 if you want to discuss sports or 2 to discuss food: ");
        userInput = input.nextInt();
        boolean nextBool;
        if(userInput == 1){
            System.out.print("Do you play ice hockey? (true/false) ");
            nextBool = input.nextBoolean();
            if(nextBool == true){
                System.out.println("Awesome!");
            }
            else{
                System.out.println("You should try it some day.");
            }
        }
        else if(userInput == 2){
            System.out.print("Haw many times did you eat pizza last week? ");
            userInput = input.nextInt();
            if(userInput >= 0 && userInput < 5){
                System.out.println("OK.");
            }
            if(userInput >= 5){
                System.out.println("You should eat better.");
            }
        }
        input.close();
    }
}
