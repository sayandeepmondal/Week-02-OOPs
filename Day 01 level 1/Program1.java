class Employees{
    private String name;
    private int id;
    private double salary;

    public Employees(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee's ID: "+id);
        System.out.println("Employee salary: "+salary);
    }
}
public class Program1{
    public static void main(String[] args) {
        Employees employee1=new Employees("Rakesh",01,50000);
        Employees employee2=new Employees("Harshi",2,75000);
        System.out.println("Employee 1 details:");
        employee1.display();
        System.out.println("Employee 2 details:");
        employee2.display();
    }
}