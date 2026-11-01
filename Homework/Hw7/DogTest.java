package Homework.Hw7;

public class DogTest {
    public static void main(String[] args) {
        Dog buddy = new Dog("Buddy", 3);

        buddy.bark();       // full energy, so a loud bark
        buddy.play(7);      // energy drops from 10 to 3
        buddy.bark();       // low energy, so a quiet bark
        buddy.play(5);      // energy would go below 0, so it stops at 0
        buddy.play(2);      // too tired to play
        buddy.sleep();      // energy back to 10
        buddy.bark();       // loud again

        // Using a getter and a setter
        System.out.println(buddy.getName() + " is " + buddy.getAge() + " years old.");
        buddy.setAge(4);
        System.out.println("After a birthday, " + buddy.getName() + " is " + buddy.getAge() + ".");
    }
}
