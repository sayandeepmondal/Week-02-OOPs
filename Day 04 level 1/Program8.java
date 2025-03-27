import java.util.ArrayList;
class Student{
    private String name;
    private int rollNumber;
    private ArrayList<Course> enrolledCourses;
    Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
        this.enrolledCourses=new ArrayList<>();
    }
    public String getName(){
        return name;
    } 
    public void enrollCourse(Course course){
        if(!enrolledCourses.contains(course)){
            enrolledCourses.add(course);
            course.enrollStudents(this);
            System.out.println(name+" enrolled in "+course.getName());
        }
    }
    public void viewEnrolledCourses(){
        System.out.println("Courses enrolled by "+name);
        if(enrolledCourses.isEmpty()) System.out.println("No Courses");
        else{
            for(Course course:enrolledCourses){
                System.out.println(course.getName());
            }
        }
    }
}
class Professor{
    private String name;
    private int profId;
    private ArrayList<Course> teachingCourses;
    public Professor(String name,int profId){
        this.name=name;
        this.profId=profId;
        this.teachingCourses=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void assignCourse(Course course){
        if(!teachingCourses.contains(course)){
            teachingCourses.add(course);
            course.setProfessor(this);
            System.out.println(name+" assigned to course: "+course.getName());
        }
    }
    public void displayCourses(){
        System.out.println("Professor Name: "+name+" Professor ID: "+profId+", Assigned Courses:");
        if(teachingCourses.isEmpty()) System.out.println("No courses");
        else{
            for(Course course:teachingCourses){
                System.out.println(course.getName());
            }
        }
    }

}
class Course{
    private String name;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;
    public Course(String name){
        this.name=name;
        this.enrolledStudents=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void setProfessor(Professor professor){
        this.professor=professor;
    }
    public void enrollStudents(Student student){
        if(!enrolledStudents.contains(student)){
            enrolledStudents.add(student);
        }
    }
    public void showCourseDetails(){
        System.out.println("Course Name: "+name+", Enrolled by Student(s):");
        if(enrolledStudents.isEmpty()) System.out.println("No Students");
        else{
            for(Student s:enrolledStudents){
                System.out.println(s.getName());
            }
        }
    }
}
public class Program8 {
    public static void main(String[] args) {
        Course course1=new Course("Python");
        Course course2=new Course("Java");
        Course course3=new Course("Spring Boot");
        Professor professor1=new Professor("Rajesh", 707);
        professor1.assignCourse(course1);
        professor1.assignCourse(course2);
        professor1.assignCourse(course3);
        Student student1=new Student("Jayavarman",408);
        Student student2=new Student("Diwin",387);
        student1.enrollCourse(course2);
        student1.enrollCourse(course3);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);
        course2.showCourseDetails();
        professor1.displayCourses();
        student1.viewEnrolledCourses();

    } 
}
