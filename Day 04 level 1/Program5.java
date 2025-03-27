import java.util.ArrayList;

class University{
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;
    public University(String name){
        this.name=name;
        this.departments=new ArrayList<>();
        this.faculties=new ArrayList<>();
    }
    public void addDepartment(String deptname){
        Department dept=new Department(deptname);
        departments.add(dept);
        System.out.println(deptname+" added to "+name);
    }
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
        System.out.println("faculty added to "+name);
    }
    public void displayUniversityInfo(){
        System.out.println("University Name: "+name);
        System.out.println("Departments:");
        if(departments.isEmpty()) System.out.println("No department");
        else{
            for(Department d:departments){
                d.showDepartmentInfo();
            }
        }
        System.out.println("Faculty Members");
        if(faculties.isEmpty()) System.out.println("No Faculty");
        else{
            for(Faculty f:faculties){
                f.displayFacultyInfo();
            }
        }
    }
    public void deleteUniversity(){
        System.out.println("University "+name+" is being deleted");
        departments.clear();
        faculties.clear();
        System.out.println("All departments and faculties have been removed");
    }

}
class Department{
    private String deptname;
    public Department(String deptname){
        this.deptname=deptname;
    }
    public void showDepartmentInfo(){
        System.out.println("Department Name: "+deptname);
    }

}
class Faculty{
    private String name;
    private String expertise;
    public Faculty(String name,String expertise){
        this.name=name;
        this.expertise=expertise;
    }
    public void displayFacultyInfo(){
        System.out.println("Faculty Name: "+name+", Expertise: "+expertise);
    }

}

public class Program5 {
    public static void main(String[] args) {
        University university=new University("VIT University");
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");
        Faculty f1=new Faculty("Dr.Aliya", "Computer Science");
        Faculty f2=new Faculty("Dr.Harshi", "Mechanical Engineering");
        university.addFaculty(f1);
        university.addFaculty(f2);
        university.displayUniversityInfo();
        university.deleteUniversity();
        f1.displayFacultyInfo();
        f2.displayFacultyInfo();
        
    }
}
