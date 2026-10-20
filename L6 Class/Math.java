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

    // ==========================================
    // STUDENT CONTRIBUTION TEMPLATE BELOW
    // ==========================================
    
    // ==========================================
    // Contributed by: [Your Name]
    // ==========================================

    /**
     * [Describe what the method does.]
     *
     * @param [n] the number that
     * @return [describe return value]
     * @throws IllegalArgumentException [when applicable]
     */

    // ==========================================
    // Contributed by: Larry Marin
    // ==========================================
    /**
     * Counts how many positive whole numbers divide the given number evenly.
     * For example, 12 has 6 divisors (1, 2, 3, 4, 6, 12).
     *
     * @param n a positive integer to find the divisors of
     * @return the number of positive divisors of n (including 1 and n itself)
     * @throws IllegalArgumentException if n is less than or equal to 0
     */
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
    
    // ==========================================
    // Contributed by: Larry Marin
    // ==========================================
    /**
     * Determines whether a number is an Armstrong number. An Armstrong number
     * equals the sum of its digits, each raised to the power of the number of
     * digits. For example, 153 is an Armstrong number because
     * 1^3 + 5^3 + 3^3 = 153.
     *
     * @param a a non-negative integer to check
     * @return true if a is an Armstrong number, false otherwise
     * @throws IllegalArgumentException if a is negative
     */
    public static boolean isArmstrongNumber(int a){
        if(a < 0){
            throw new IllegalArgumentException("The number cannot be negative.");
        }
        if(a == 0){
            return true;
        }

        int num = a;
        int digit = 0;
        int counter = 0;
        int total = 0;

        while(num!=0){
            num /= 10;
            counter+=1;
        }

        num = a;
        while(num!=0){
            digit = num%10;
            int power = 1;
            for(int i = 1; i <= counter; i++){
                power*=digit;
            }
            total+=power;
            num/=10;
        }

        if(a == total){
            return true;
        }
        else{
            return false;
        }

    }

    // ==========================================
    // Contributed by: Larry Marin
    // ==========================================
    /**
     * Determines whether a number is prime. A prime number is a whole number
     * greater than 1 whose only positive divisors are 1 and itself. For example,
     * 7 is prime, while 9 is not because it is divisible by 3.
     *
     * @param p the integer to check, which must be 2 or greater
     * @return true if p is prime, false otherwise
     * @throws IllegalArgumentException if p is less than 2
     */
    public static boolean isPrime(int p){
        if(p < 2){
            throw new IllegalArgumentException("Numbers below 2 are not prime.");
        }
        else if(p == 2){
            return true;
        }
        else if(p%2 == 0){
            return false;
        }

        for(int i = 3; i * i <= p; i+=2){
            if(p%i == 0){
                return false;
            }
        }
        return true;
    }
}