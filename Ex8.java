import java.util.Scanner;
class Ex8{
    
    public static void main(String [] args){
        String var;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 4 digit integer: ");
        var = input.next();

        System.out.println("First digit: " + var.charAt(0));
        System.out.println("Second digit: " + var.charAt(1));
        System.out.println("Third digit: " + var.charAt(2));
        System.out.println("Fourth1 digit: " + var.charAt(3));
        input.close();
    }
}
