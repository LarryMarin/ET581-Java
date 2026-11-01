package Homework.Hw7;

public class ElementTest {
    public static void main(String[] args) {
        Element hydrogen = new Element("Hydrogen", "H", 1, 1.008);
        Element helium = new Element("Helium", "He", 2, 4.0026);
        Element lithium = new Element("Lithium", "Li", 3, 6.94);
        Element carbon = new Element("Carbon", "C", 6, 12.011);
        Element oxygen = new Element("Oxygen", "O", 8, 15.999);

        System.out.println(hydrogen);
        System.out.println(helium);
        System.out.println(lithium);
        System.out.println(carbon);
        System.out.println(oxygen);
    }
}
