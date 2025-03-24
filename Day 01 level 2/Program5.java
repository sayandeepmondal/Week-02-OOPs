import java.util.Scanner;
class CartItem{
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public double getTotalPrice(){
        return price *quantity;
    }
    public void displayItem(){
        System.out.println(itemName+" Rs-"+price+" of quantity "+quantity+" Rs." +getTotalPrice());
    }

}
public class Program5{
    CartItem cart=null;
    Scanner sc=new Scanner(System.in);
    public void addItem(){
        System.out.println("Enter Itemname:");
        String item=sc.nextLine();
        System.out.println("Enter Price:");
        double price=sc.nextDouble();
        System.out.println("Enter quantity");
        int quantity=sc.nextInt();
        sc.nextLine();
        cart=new CartItem(item,price,quantity);
        System.out.println("Item added to cart");
    }
    public void removeItem(){
        if(cart==null) System.out.println("Cart is already empty");
        else{
            cart=null;
            System.out.println("Item removed from cart");
        }
    }
    public void displayCart(){
        if(cart==null) System.out.println("Cart is empty");
        else{
            System.out.println("Shopping Cart:");
            cart.displayItem();
        }
    }
    public void run(){
        while(true){
            System.out.println("\n1.Add Item \n2.Remove item \n3.Display Cart \n4.Exit");
            System.out.println("Enter choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    displayCart();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    sc.close();
                    return;
            
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Program5 result=new Program5();
        result.run();
    }
}