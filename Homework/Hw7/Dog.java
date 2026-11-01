package Homework.Hw7;

public class Dog {
    // Instance variables
    private String name;
    private int age;
    private int energy;   // from 0 (exhausted) to 10 (full of energy)

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 10;   // every dog starts fully rested
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Makes the dog play fetch for a number of minutes.
     * Each minute of playing uses 1 point of energy, and the dog's energy
     * never drops below 0. If the dog is too tired, it refuses to play.
     * This method CHANGES the energy instance variable.
     */
    public void play(int minutes) {
        if (energy == 0) {
            System.out.println(name + " is too tired to play.");
        } else {
            energy = energy - minutes;
            if (energy < 0) {
                energy = 0;
            }
            System.out.println(name + " played fetch for " + minutes
                    + " minutes. Energy is now " + energy + ".");
        }
    }

    /**
     * Makes the dog take a nap, which restores its energy to full (10).
     * This method CHANGES the energy instance variable.
     */
    public void sleep() {
        energy = 10;
        System.out.println(name + " took a nap and is full of energy again!");
    }

    /**
     * Makes the dog bark. A tired dog barks quietly, and an energetic dog
     * barks loudly. This method USES the energy instance variable but does
     * not change it.
     */
    public void bark() {
        if (energy > 5) {
            System.out.println(name + " says: WOOF WOOF!");
        } else {
            System.out.println(name + " says: woof...");
        }
    }
}
