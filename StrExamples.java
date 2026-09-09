import java.util.Scanner;
class StrExamples{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
        String firstName = "";
        String lastName = "";
        System.out.print("Please enter first name: ");
        firstName = input.next();
        System.out.print("Please enter last name: ");
        lastName = input.next();
        //System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Full name: " + firstName.concat(" ").concat(lastName));
        int totalLength = firstName.length() + lastName.length();
        System.out.println("Total length: " + totalLength);
        //System.out.println("Total length: " + (firtName.length() + lastName.length()));
        System.out.println("Initials: " + firstName.charAt(0) + "." + lastName.charAt(0));

        //2 Output a string one character at a time.
        System.out.print("Pleas enter a string with a length of 5: ");
        String shortString = input.next();
        System.out.println(shortString.charAt(0));
        System.out.println(shortString.charAt(1));
        System.out.println(shortString.charAt(2));
        System.out.println(shortString.charAt(3));
        System.out.println(shortString.charAt(4));

        //3 Output one string one word at a time
        String text = "This is a text string.";
        System.out.println(text.substring(0,4));
        System.out.println(text.substring(5,7));
        System.out.println(text.substring(8,9));
        System.out.println(text.substring(10,14));
        System.out.println(text.substring(15, 21));

        
        input.close();
    }
}
