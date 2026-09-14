import java.util.Scanner;
import java.util.StringTokenizer;
public class StrTokenizerPractice {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phone number in the following format");
        System.out.println("xxx-xxx-xxxx");
        String phoneNum = input.nextLine();
        String delimiters = "-";
        StringTokenizer phoneNumFactory = new StringTokenizer(phoneNum, delimiters);
        String firstNum = phoneNumFactory.nextToken();
        String secondNum = phoneNumFactory.nextToken();
        String thirdNum = phoneNumFactory.nextToken();

        System.out.println("(" + firstNum + ")" + " " + secondNum + " " + thirdNum);

        input.close();
    }
}
