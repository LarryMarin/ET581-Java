public class Manager extends Employee{
    Manager(int i, String n, String d, int s){
        super(i, n, d, s);
        setBonus(300);
    }

    void display(){
        System.out.println("ID: " + getId() + " Name: " + getName() + " Salary: " + getSalary() + " Department: " 
        + getDepartment() + " Bonus: " + getBonus());
    }
}