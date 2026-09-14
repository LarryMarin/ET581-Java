import java.util.Scanner;
public class SwitchPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("c - cheeseburger");
        System.out.println("b - beefburger");
        System.out.println("f - frenchfry");
        System.out.println("w - water");
        System.out.print("Enter your choice: ");
        char choice = input.next().charAt(0);

        switch(choice){
            case 'c':
                System.out.println("cheeseburger");
                break;
            case 'b':
                System.out.println("beefburger");
                break;
            case 'f':
                System.out.println("frenchfry");
                break;
            case 'w':
                System.out.println("water");
                break;
            default:
                System.out.println("Invalid option.");
        }

        input.close();
    }
}
