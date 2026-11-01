package Ex2;

public class Tiger extends Primate {
    private int weight;

    public Tiger(int age, String name, int weight) {
        super(age, name);
        this.weight = weight;
    }

    public void display() {
        System.out.println("Age: " + getAge() + " Name: " + getName() + " Weight: " + weight);
    }
}
