public class ForPractice {
    public static void main(String[] args) {
        //Ex1 Print number from 1 to 10
        for(int i = 1; i<=10;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //Ex2 Print number from 1 to 100
        for(int i = 1; i <= 100; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //Ex3 Print number from 50 to 100
        for(int i = 50; i<=100; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //Ex4 Print out only even numbers from 1 to 100
        for(int i = 2; i<=100; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
        //Ex5 print sum of number from 1 to 100
        int sum = 0;
        for(int i = 1; i<=100; i+=1){
            sum += i;
        }
        System.out.println("The sum of numbers between 1 to 100 is: " + sum);
        //Ex6 Print sum of even number from between 1 to 100
        sum = 0;
        for(int i = 2; i<=100; i+=2){
            sum += i;
        }
        System.out.println("The sum of even number between 1 to 100 is: " + sum);
        //Ex7 Print sum of even number between 50 to 100
        sum = 0;
        for(int i = 50; i<=100; i+=2){
            sum+=i;
        }
        System.out.println("The sum of even number between 50 to 100 is:" + sum);
        //Ex8 Print 10 Factorial, 10! = 1*2*3*4*5*6*7*8*9*10
        int factorial = 1;
        for(int i = 2; i<=10; i++){
            factorial*=i;
        }
        System.out.println("10 Factorial is: " + factorial);
    }
}
