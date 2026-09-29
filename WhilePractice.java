import java.util.Scanner;

class ExWhile{
    public static void main(String [] args){
        int i = 1;
        //Print out 1-10
        while(i<=10){
            System.out.println(i);
            i++;
        }
        i = 1;
        //Print out 1-100
        while(i<=100){
            System.out.println(i);
            i++;
        }
        i = 1;

        //Print out even numbers from 1-100
        while(i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        //Print out 50-100
        // i = 50;

        // while(i<=100){
        //     System.out.println(i);
        //     i++;
        // }
        i = 1;
        while(i<=100){
            if(i<50){
                i++;
            }
            if(i>=50){
                System.out.println(i);
                i++;
            }
        }

        //Print out the sum from 1-100
        i = 0;
        int sum = 0;
        while(i<=100){
            i++;
            sum +=i;
            if(i == 100){
                System.out.println("The sum from 1-100 is " + sum);
            }
        }

        //Print out the sum of the even numbers from 1-100
        // i = 0;
        // sum = 0;
        // while(i<=100){
        //     i++;
        //     if(i%2==0){
        //         sum+=i;
        //     }
        //     if(i==100){
        //         System.out.println("The sum of all the even numbers from 1-100 is " + sum);
        //     }
        // }

        //Print sum of even numbers between 50-100
        i = 50;
        sum = 0;
        while(i<=100){
            sum +=i;
            i+=2;
        }
        System.out.println("The sum of all the even numbers from 50-100 is " + sum);

        //Print 10 factorial, 10! = 1*2*3*4*5*6*7*8*9*10
        // i = 1;
        // while(i<=10){
        //     if(i!=10){
        //         System.out.print(i + "*");
        //     }
        //     else{
        //         System.out.print(i);
        //     }
        //     i++;
        // }
        int f = 1;
        i = 1;
        while(i <= 10){
            f = f * i;
            i++;
        }
        System.out.println(f);
        //Use do while to print 1-10
        i = 1;
        do { 
            System.out.println(i + " ");
            i++;
        } while (i<=10);

        //Check if a number is prime or not
        Scanner input = new Scanner(System.in);
        int prime;
        System.out.print("Please enter a number: ");
        prime = input.nextInt();
        i = 2;
        int count = 0;
        while(i<prime){
            if(prime%1 == 0){
                count++;
            }
            i++;
        }
        if(count == 0)
            System.out.println(prime + " is a prime number");
        else{
            System.out.println(prime + " is not a prime number.");
        }
        //Ask the user for a prime number. Check if the user input is prime or not. If it is not ask them to input again.

        //Ex9 
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        do { 
            System.out.print(num + " ");
            num--;
        } while (num!=0);

        //Ex10
        System.out.print("\nPlease enter 2 numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        
        if(n1 > n2){
            while(n1 >= n2){
                System.out.print(n1 + " ");
                n1--;
            }
        }
        else{
            while(n1 <= n2){
                System.out.print(n1 + " ");
                n1++;
            }
        }
        
        //Ex14
        int maxVal = 0, minVal = 0;
        do{
            System.out.print("Enter a minimum value between 1 and 100: ");
            minVal = input.nextInt();
            System.out.print("Enter a maximum value between 1 and 100: ");
            maxVal = input.nextInt();

            if(minVal > 100 || minVal <=0 || maxVal >100 || maxVal <= 0){
                System.out.println("Values must be within specified range.");
            }
            else if(maxVal < minVal){
                System.out.println("Maximum value must be greater than minimum value.");
            }
        }while(minVal > 100 || minVal <=0 || maxVal >100 || maxVal <= 0 || maxVal < minVal);
        i = maxVal;
        while(i >= minVal){
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }
}
