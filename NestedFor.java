import java.util.Scanner;
class NestedFor{
    public static void main(String[] args) {
        //Ex14 Ask user input an integer, and print the number as following.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int integer = input.nextInt();
        
        for(int i = 1; i <= integer; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Ex16 Ask user input an integer and print it backwards
        System.out.print("Enter integer: ");
        int n = input.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Ex17 Ask user input an integer and print the even numbers
        // System.out.print("Enter integer: ");
        // n = input.nextInt();

        // for(int i = 1; i <= n; i++){
        //     for(int j = 2; j <= n*2; j+=2){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //Ex18 
        System.out.print("Enter integer: ");
        n = input.nextInt();
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

        //Ex20 
        System.out.print("Enter integer: ");
        n = input.nextInt();
        counter = 1;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

        //Ex21
        System.out.print("Enter integer: ");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
                sum += j;
            }
            System.out.println(" = " + sum);
        }

        //Ex22
        System.out.print("Enter integer: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i + "! = ");
            int factorial = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
                factorial *= j;
            }
            System.out.println("= " + factorial);

        }

        //Ex25
        System.out.print("Enter height: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
                if(j == i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Ex26
        System.out.print("Enter height: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("  ");
                if(i + j == n+1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Ex27
        System.out.print("Enter height: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.print("Enter height: ");
        n = input.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}
