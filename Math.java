// Math.java

public class Math {

    // ==========================================
    // Contributed by: Professor (Starter Code)
    // ==========================================

    /**
     * Calculates the sum of all integers in the provided array.
     *
     * @param numbers the input array of integers
     * @return the total sum of the array elements
     * @throws IllegalArgumentException if the array is null
     */
    public static int sum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Finds the maximum value in the provided array.
     *
     * @param numbers the input array of integers
     * @return the largest integer in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int max(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    /**
     * Finds the minimum value in the provided array.
     *
     * @param numbers the input array of integers
     * @return the smallest integer in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int min(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    // ==========================================
    // STUDENT CONTRIBUTION TEMPLATE BELOW
    // ==========================================
    
    // ==========================================
    // Contributed by: [Your Name]
    // ==========================================

    /**
     * [Describe what the method does.]
     *
     * @param [parameter] [describe parameter]
     * @return [describe return value]
     * @throws IllegalArgumentException [when applicable]
     */
    /*
    public static [returnType] [methodName]([parameters]) {
        // Your implementation
    }
    */
    
    // Add your second and third methods here using the same format.

    public static int countDivisors(int n){
        if(n <=0){
            throw new IllegalArgumentException("Invalid number. Please enter a number greater than 0");
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(countDivisors(12));
    }
    public static int isArmstrongNumber(int a){
        for()
    }

    // public static int isPrime(int p){

    // }
}