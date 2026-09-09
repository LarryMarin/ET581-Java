import java.util.Scanner;
public class IfEx {
    public static void main(String [] args){
        int age = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        if(age >= 18)
            System.out.println("You can drive.");
        input.close();
    }   
}
