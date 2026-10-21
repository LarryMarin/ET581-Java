class Person{
    static void from(String f){
        System.out.println("I am from " + f);
    }

    public static void main(String[] args) {
        from("NYC");
        from("Beijing");
    }
}

public class Person {
    String name;

    Person(String name){
        this.name = name;
    }
    Person(){
        this.name = "TBD";
    }

    public void display(){
        System.out.println("Name: " + this.name);
    }
}
