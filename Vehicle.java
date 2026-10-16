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
