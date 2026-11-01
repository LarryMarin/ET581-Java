class Vehicle {
    String name;
    int n;
    public Vehicle(String brand, int price) {
        name = brand;
        n = price;
    }

    public Vehicle(String brand){
        name = brand;
        n = 0;
    }

    public Vehicle(){
        name = "TBD";
        n = 0;
    }
    void display(){
        System.out.println("Brand: " + name + ", Price: " + n);
    }
}
/*
class Vehicle {
    String name;
    int price;
    int numcylinder;
    public Vehicle(String name, int price, int numcylinder) {
        this.name = name;
        this.price = price;
        this.numcylinder = numcylinder;
    }

    public Vehicle(int price, int numcylinder){
        this("TBD", price, numcylinder);
    }
    public Vehicle(String name, int price){
        this(name, price, 0);
    }
    public Vehicle(String name){
        this(name, 0, 0);
    }
    public Vehicle(){
        this("TBD", 0, 0);
    }
    void display(){
        System.out.println("Brand: " + name + ", Price: " + price + ", Number of Cylinders = " + numcylinder);
    }

    public String toString(){ //now we can use System.out.println(v1) and it wont print the memory address. It will return the following string.
        return "Brand: " + name + ", Price: " + price + ", Number of Cylinders = " + numcylinder;
    }
}
*/
