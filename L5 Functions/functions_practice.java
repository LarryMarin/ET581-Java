public class functions_practice {
    public static void print_name(){
        System.out.println("Larry Marin");
    }

    public static void print_age(int age){
        System.out.println("You are " + age + " years old.");
    }

    public static void print_info(String name, int age){
        System.out.println("Your name is " + name + ", you are " + age + " years old.");
    }

    static double absolute(double n){
        return Math.abs(n);
    }

    static double area(int l, int w){
        return (l*w)/2.0;
    }

    static double mult(double a, double b){
        return a*b;
    }

    static int mult(int a, int b, int c){
        return a*b*c;
    }

    static void displayReverse(int n){
        while(n>0){
            System.out.print(n%10);
            n/=10;
        }
    }

    static int numberToTens(int n){
        int result = 1;
        while(n>=10){
            n /= 10;
            result *= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        //Void Functions: do not return anything
        print_name();
        print_name();
        print_name();

        print_age(10);
        print_age(22);
        print_age(44);

        print_info("David", 11);
        print_info("Brian", 22);
        print_info("Jack", 33);

        //Non-Void Functions: return something

        System.out.println("Absolute Value:");
        System.out.println(absolute(5.6));
        System.out.println(absolute(-10));
        System.out.println(absolute(0));
        
        System.out.println("Area of a triangle:");
        System.out.println(area(5,5));
        System.out.println(area(7,9));
        System.out.println(area(1,3));

        //Array Overloading
        System.out.println(mult(1.5,2.5));
        System.out.println(mult(4,5));
        System.out.println(mult(10,20));
        System.out.println(mult(1.5,10));
        System.out.println(mult(10,1.5));
        System.out.println(mult(2,3,4));

        displayReverse(1234);
        System.out.println(numberToTens(43987));

    }
}
