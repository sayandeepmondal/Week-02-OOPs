import java.util.ArrayList;

class School{
    private String name;
    private ArrayList<Student> students;
    public School(String name){
        this.name=name;
        this.students=new ArrayList<>();
    }
    public void addStudent(Student student){
        if(!students.contains(student)){
            students.add(student);
            System.out.println(student.getName()+" added to School:"+name);
        }
    }
    public void displaySchoolInfo(){
        System.out.println("Students in School "+name+":");
        for(Student s:students){
            System.out.println(s.getName());
        }
    }
}
class Course{
    private String name;
    private int courseId;
    private ArrayList<Student> enrolledStudents;
    public Course(String name,int courseId){
        this.name=name;
        this.courseId=courseId;
        this.enrolledStudents=new ArrayList<>();
    }
    public String getCourseName(){
        return name;
    }
    public void addStudent(Student student){
        if(!enrolledStudents.contains(student)){
            enrolledStudents.add(student);
        }
    }
    public void viewEnrolledStudents(){
        System.out.println("Students enrolled in course: "+name);
        if(enrolledStudents.isEmpty()) System.out.println("No Students");
        else{
            for(Student s:enrolledStudents){
                System.out.println(s.getName());
            }
        }
    }
}
class Student{
    private String name;
    private int rollNumber;
    private ArrayList<Course> courses;
    public Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
        this.courses=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void enrollCourse(Course course){
        if(!courses.contains(course)){
            courses.add(course);
            course.addStudent(this);
            System.out.println(name+" enrolled in "+course.getCourseName());
        }
    }
    public void viewCourses(){
        System.out.println("Courses Enrolled by "+name);
        if(courses.isEmpty()) System.out.println("No courses");
        for(Course c:courses){
            System.out.println(c.getCourseName());
        }
    }
}
public class Program4 {
    public static void main(String[] args) {
        School school=new School("Velammal");
        Course course1=new Course("Maths",1);
        Course course2=new Course("Science",2);
        Course course3=new Course("CSC",3);
        Student student1=new Student("Rakesh", 412);
        Student student2=new Student("Jai", 408);
        school.addStudent(student1);
        school.addStudent(student2);
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student1.enrollCourse(course3);
        student2.enrollCourse(course3);
        student1.viewCourses();
        student2.viewCourses();
        course3.viewEnrolledStudents();
        school.displaySchoolInfo();
    } 
}
