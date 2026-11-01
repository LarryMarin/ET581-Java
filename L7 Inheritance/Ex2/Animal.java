package Ex2;

public class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Age: " + age);
    }
}
