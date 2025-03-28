class Vehicle{
    public int maxSpeed;
    public String fuelType;
    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void displayInfo(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}
class Car extends Vehicle{
    public int seatCapacity;
    public Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}
class Truck extends Vehicle{
    public int loadCapacity;
    public Truck(int maxSpeed,String fuelType,int loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: "+loadCapacity);
    }
}
class Motorcycle extends Vehicle{
    public boolean hasSideCar;
    public Motorcycle(int maxSpeed,String fuelType,boolean hasSideCar){
        super(maxSpeed,fuelType);
        this.hasSideCar=hasSideCar;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Side Car? "+(hasSideCar? "Yes":"No"));
    }
}
public class Program3 {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car(220, "Petrol", 5);
        vehicles[1]=new Truck(150, "Diesel", 10);
        vehicles[2]=new Motorcycle(180, "Petrol", false);
        System.out.println("Vehicle Information:");
        for(Vehicle v:vehicles){
            v.displayInfo();
            System.out.println("-----------------------------------");
        }
    }
    
}
