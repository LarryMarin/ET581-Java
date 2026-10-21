public class Student extends Person{
    int id;

    Student(String name, int id){
        super(name);
        this.id = id;
    }
    Student(){
        super();
        this.id = 0;
    }
    public void display(){
        System.out.println("Name: " + this.name + "ID: " + this.id);
    }
}
