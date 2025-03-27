import java.util.ArrayList;

class Product{
    private String name;
    private double price;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void displayProductInfo(){
        System.out.println("Product: "+name+", Price: $"+price);
    }
}
class Customer{
    private String name;
    private ArrayList<Order> orders;
    Customer(String name){
        this.name=name;
        this.orders=new ArrayList<>();
    }
    public void order(Order order){
        orders.add(order);
        System.out.println(name+" placed Order#"+order.getId());
    }
    public void viewOrder(){
        System.out.println("Customer Name: "+name);
        if(orders.isEmpty()) System.out.println("No orders");
        else{
            for(Order o:orders){
                o.displayOrderInfo();
            }
        }
    }
}
class Order{
    private int orderId;
    private ArrayList<Product> products;
    public Order(int orderId){
        this.orderId=orderId;
        this.products=new ArrayList<>();
    }
    public int getId(){
        return orderId;
    }
    public void addProduct(Product product){
        products.add(product);
        System.out.println(product.getName()+" added to Order#"+orderId);
    }
    public void displayOrderInfo(){
        System.out.println("Order Id: #"+orderId);
        if(products.isEmpty()) System.out.println("No products");
        else{
            double total=0;
            for(Product p:products){
                p.displayProductInfo();
                total+=p.getPrice();
            }
            System.out.println("Total Price: "+total);
        }
    }

}
public class Program7 {
    public static void main(String[] args) {
        Customer customer1=new Customer("Rakesh");
        Product product1=new Product("Pencil",5.0);
        Product product2=new Product("Pen",10.0);
        Order order1=new Order(123);
        order1.addProduct(product1);
        order1.addProduct(product2);
        customer1.order(order1);
        customer1.viewOrder();
    }
}
