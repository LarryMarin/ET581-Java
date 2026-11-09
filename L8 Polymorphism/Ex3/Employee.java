public class Employee{
    private int id;
    private String name;
    private String department;
    private int salary;
    private int bonus = 200;
    private int deduction;

    public Employee(int id, String name, String department, int salary, int deduction) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.deduction = deduction;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getDesignation(){
        return this.designation;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

    public int getBonus(){
        return bonus;
    }

    void display(){
        System.out.println("ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + department + " Bonus: " + bonus);
    }

    
}