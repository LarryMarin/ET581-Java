public class Main{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Jack";
        emp1.id = 123456;

        Employee emp2 = new Employee();
        emp2.name = "David";
        emp2.id = 888888;

        System.out.println("Name: " + emp1.name + " ID: " + emp1.id);
        System.out.println("Name: " + emp2.name + " ID: " + emp2.id);

        Student stu1 = new Student();
        stu1.name = "Tim";
        stu1.gpa = 3.95;

        Student stu2 = new Student();
        stu2.name = "Tom";
        stu2.gpa = 3.56;

        System.out.println("Name: " + stu1.name + " GPA: " + stu1.gpa);
        System.out.println("Name: " + stu2.name + " GPA: " + stu2.gpa);

        Vehicle v1 = new Vehicle("Toyota", 30000);
        Vehicle v2 = new Vehicle("Tesla", 80000);
        Vehicle v3 = new Vehicle("BMW");
        Vehicle v4 = new Vehicle();

        v1.display();
        v2.display();
        v3.display();
        v4.display();
    }
}
/*
public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Jack", 12345678, 80, 90);
        c1.display();

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Honda");
        Vehicle v3 = new Vehicle("BMW", 50000, 6);
        Vehicle v4 = new Vehicle("Tesla", 70000);

        v1.display();
        v2.display();
        v3.display();
        v4.display();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);  
    }
}

public class main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        Student s1 = new Student("David", 12);
        s1.display();
        Person p = new Person("Tom");
        p.display();
    }
}
*/
