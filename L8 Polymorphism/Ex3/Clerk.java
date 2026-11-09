public class Clerk extends Employee{

    Clerk(int i, String n, String d, int s){
        super(i, n, d, s);
        setBonus(100);
    }

    void display(){
        System.out.println("ID: " + getId() + " Name: " + getName() + " Salary: " + getSalary() + " Department: " 
        + getDepartment() + " Bonus: " + getBonus());
    }

}