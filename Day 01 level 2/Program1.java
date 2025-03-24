class Student{
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public char calculateGrade(){
        if(marks>=90) return 'A';
        else if(marks>=80) return 'B';
        else if(marks>=70) return 'C';
        else if(marks>=60) return 'D';
        else return 'F';
    }
    public void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll Number: "+rollNumber);
        System.out.println("Student marks: "+marks);
        System.out.println("Student Grade: "+calculateGrade());
    }
}
public class Program1{
    public static void main(String[] args) {
        Student stud1=new Student("Rakesh", 412, 95);
        Student stud2=new Student("Aliya",403,70);
        System.out.println("Student 1 Details:");
        stud1.display();
        System.out.println("Student 2 Details:");
        stud2.display();
    }
}