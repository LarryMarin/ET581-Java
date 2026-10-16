package Homework;
//Larry Marin, 23656183, Assignment 5, D-10:10am-11:50am
//I did not collaborate with anyone else on this assignment.
public class Hw6 {
    // 1. Write a method named foundation which accepts an integer parameter named width.
    // When invoked, the method should print a line of exactly width many ‘-‘ characters.
    // For example, the result of invoking foundation (7) should print:

    public static void foundation(int width) {
        for (int i = 1; i <= width; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //2. Write a method named walls which accepts two integer parameters named width and
    // height. When invoked, the method should print height many lines, each consisting of
    // two 'l' characters separated by exactly width - 2 spaces. You may assume that width will
    // always be at least two when invoking the method. For example, invoking walls (7,3)
    // should print
    public static void walls(int width, int height) {
        for (int i = 1; i <= height; i++) {
            System.out.print("|");
            for (int j = 1; j <= width - 2; j++) {   // width - 2 spaces
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    // 3. Write a method named roof which accepts an integer parameter named width. When
    // invoked, the method should print an upright triangle with a base of exactly width many '
    // characters, and and two character parameters named baseMaterial and cornerMaterial.
    // When invoked, the method should print an upright triangle with a base of width many
    // characters, and width/2 lines above it where each line contains narrower and narrower
    // slashes, forming an image of a triangle with a'+' on top. You may assume that width will
    // always be an even number when invoking the method.
    // For example, invoking roof (8) should print:

    public static void roof(int width) {
        char baseMaterial = '-';
        char cornerMaterial = '^';
        int half = width / 2;

        for (int s = 0; s < half - 1; s++) {
            System.out.print(" ");
        }
        System.out.println(cornerMaterial);

        for (int line = 1; line < half - 1; line++) {
            // spaces before the "/"
            for (int s = 0; s < half - 1 - line; s++) {
                System.out.print(" ");
            }
            System.out.print("/");

            for (int s = 0; s < 2 * line; s++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        System.out.print("/");
        for (int i = 0; i < width - 2; i++) {
            System.out.print(baseMaterial);
        }
        System.out.println("\\");
    }

    // 4. Write a method named house which accepts two integer parameters width and
    // height, and, you guessed it, this method should draw a house with walls of size width by
    // height, an appropriate foundation below it, and a roof on top. For example, invoking
    // house (8,3) should print:

    public static void house(int width, int height) {
        roof(width);
        walls(width, height);
        foundation(width);
    }

    public static void main(String[] args) {
        // foundation(7);
        // walls(7,3);
        // roof(8);
        house(8, 3);
    }
}