import java.util.ArrayList;

class Employee{
    private String name;
    private String position;
    public Employee(String name,String position){
        this.name=name;
        this.position=position;
    }
    public String getNamePositon(){
        return name+" : "+position;
    }
    public void displayEmployeeInfo(){
        System.out.println("Employee: "+name+" Position: "+position);
    }
}
class Department{
    private String deptname;
    private ArrayList<Employee> employees;
    public Department(String deptname){
        this.deptname=deptname;
        this.employees=new ArrayList<>();
    }
    public String getDeptname(){
        return deptname;
    }
    public void addEmployees(Employee employee){
        employees.add(employee);
        System.out.println("Employee "+employee.getNamePositon()+" added to "+deptname);
    }
    public void displayDepartmentInfo(){
        System.out.println("Department Name: "+deptname);
        if(employees.isEmpty()) System.out.println("No Employees");
        else{
            for(Employee emp:employees){
                System.out.println(emp.getNamePositon());
            }
        }
    }
}
class Company{
    private String companyName;
    private ArrayList<Department> departments;
    public Company(String companyName){
        this.companyName=companyName;
        this.departments=new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void deleteCompany(){
        System.out.println("Company "+companyName+" is being deleted....");
        departments.clear();
        System.out.println("All departments and employees have been removed");
    }
    public void displayCompanyInfo(){
        System.out.println("Company Name: "+companyName);
        if(departments.isEmpty()) System.out.println("Department is empty");
        else{
            for(Department dept:departments){
                dept.displayDepartmentInfo();
            }
        }
    }
}
public class Program3 {
    public static void main(String[] args) {
        Company company1=new Company("Capgemini");
        Department dept1=new Department("Engineering");
        Department dept2=new Department("Sales");
        company1.addDepartment(dept1);
        company1.addDepartment(dept2);
        Employee emp1=new Employee("Rakesh", "Analyst");
        Employee emp2=new Employee("Monesh", "Devops Engineer");
        Employee emp3=new Employee("Balaji", "Sales Manager");
        dept1.addEmployees(emp1);
        dept1.addEmployees(emp2);
        dept2.addEmployees(emp3);
        company1.displayCompanyInfo();
        company1.deleteCompany();
        company1.displayCompanyInfo();
    }
}
