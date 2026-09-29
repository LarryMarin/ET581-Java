import java.util.Scanner;
public class IfEx {
    public static void main(String [] args){
        int age = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        if(age > 18 && age < 75)
            System.out.println("You can drive.");
        else if(age >=75){
            System.out.println("Do not drive for your safety");
        }
        else if(age < 0){
            System.out.println("You are an idiot");
        }
        else{
            System.out.println("You cannot drive.");
        }
        input.close();
    }   
}
