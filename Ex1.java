import java.util.Scanner;

public class Ex1{
    public static void main(String [] args){
        System.out.println("Hello World!");
        //can also use print but does not put the string in its own line. javac Ex1.java is for machine code
        //java Ex1.class is an executable file if you want to give it to someone else.
        System.out.println("I am new to Java program!");
        System.out.println("Hello, Larry");
        System.out.println("Item\tprice\nApple\t1.75\nOrange\t3.50\nBanana\t2.25\nTotal\t9.00");
        /*
        System.out.println("Item\tprice");
        System.out.println("Apple\t1.75");
        System.out.println("Orange\t3.50");
        System.out.println("Banana\t2.25");
        System.out.println("Total\t9.00");
        */
        System.out.println("Name \t \t \t ID");
        System.out.println("Tom Brown \t \t \t 15267789");
        System.out.println("My name is very long \t \t 12345678");
        System.out.println("David \t \t \t \t 99999999");
        System.out.println("Test");
        /**
         * documentation comment to explain to the reader what is happening in the code
         */
        
        //Casting - turning one type to another. from a bigger type to a smaller type we do not need to do anything. but from a smaller type to a bigger type we need to do int myInt = (bigger type) myBiggerType
        //if we want int to be a double we need to add (int) before we assign it myDouble
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);

        double myDoub = 10.512341d;
        float myFloat = 19.99f;
        byte myByte = 10;

        short myShort = (short) myDoub;
        int myInt2 = (int) myFloat;
        //since byte is smaller than long we can just assign it to long easily.
        long myLong = myByte;

        System.out.println(myShort);
        System.out.println(myInt2);
        System.out.println(myLong);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int number = input.nextInt();
        System.out.print("You entered " + number);

        //closing the scanner object
        input.close();
        //we can use nextLong(), nextDouble(), nextFloat(), etc.


    }
}
