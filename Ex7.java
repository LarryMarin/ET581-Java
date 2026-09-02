import java.util.Scanner;

public class Ex7 {
    public static void main(String [] args){
        int var1, var2, var3;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first variable: ");
        var1 = input.nextInt();
        System.out.print("Please enter a second variable: ");
        var2 = input.nextInt();

        var3 = var1/var2;

        System.out.println(var1 + "/" + var2 + " = " + var3);
        input.close();
    }
}
