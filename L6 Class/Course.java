class Course{
    private String name = "TBD";
    private int id = 0;
    private int midterm = 0;
    private int finalExam = 0;

    Course(String n, int i, int m, int f){
        name = n;
        id = i;
        midterm = m;
        finalExam = f;
    }

    void display(){
        char gpa;
        double numericGrade = midterm * 0.4 + finalExam * 0.6;
        if(numericGrade >= 90){
            gpa = 'A';
        }
        else if(numericGrade >= 80){
            gpa = 'B';
        }
        else if(numericGrade >= 70){
            gpa = 'C';
        }
        else{
            gpa = 'F';
        }
        System.out.println("Name: " + name + ", ID: " + id + ", Midterm: " + midterm + ", Final: " + finalExam);
        System.out.println("Overall: " + midterm + " * 0.40 + " + finalExam + " * 0.60 = " + numericGrade + " => " + gpa);
    }

}
