public class arrays_practice{
    public static void main(String[] args) {
        //Exercise 4: Write a program that initializes array with 4, 5, 3, 10, 9,
        // and string array with "Max", "Arthur", "Freddy", "Kelly", “Jack". Print the
        // name and score in the same line to the console.
        int[] numArray = {4, 5, 3, 10, 9};
        String[] nameArray = {"Max", "Arthur", "Freddy", "Kelly", "Jack"};

        for(int i = 0; i < numArray.length; i++){
            System.out.println(nameArray[i] + " " + numArray[i]);
        }

        // Exercise 5: Create a short program that uses array.
        // Ask the user for number of students.
        // Declare an array of string to store the names.
        // Using a loop, read in each name into the array.
        // Using a loop, display the names to the user.
    }
}
