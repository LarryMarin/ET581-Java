package Ex2;

public class Primate extends Animal {
    private String name;

    public Primate(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Age: " + getAge() + " Name: " + name);
    }
}
