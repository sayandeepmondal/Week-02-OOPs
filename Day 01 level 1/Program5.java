class MobilePhone{
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand,String model,double price){
        this.brand =brand;
        this.model=model;
        this.price=price;
    }
    public void showDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class Program5{
    public static void main(String[] args) {
        MobilePhone m1=new MobilePhone("Oneplus","10R",29999.99);
        m1.showDetails();
        
    }
    
}
