import java.util.Scanner;
public class Ex9 {
    public static void main(String [] args){
        double celsius = 0, fahrenheit = 0;
        Scanner input = new Scanner(System.in);
        //%.2f shows 2 decimal places, %d is for a whole number
        System.out.print("Please enter the temperature in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = celsius * 9/5.0 + 32;
        //this prints out only one decimal place: %.1f
        System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);

        input.close();
    }
}
