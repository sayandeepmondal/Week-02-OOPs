class Item{
    private int itemcode;
    private String itemname;
    private double price;

    public Item(int itemcode,String itemname,double price){
        this.itemcode=itemcode;
        this.itemname=itemname;
        this.price=price;
    }
    public void display(){
        System.out.println("Item Code: "+itemcode);
        System.out.println("Item Name: "+itemname);
        System.out.println("Price: "+price);
    }
    public double calculateTotal(int quantity){
        return price*quantity;

    }
}

public class Program4 {
    public static void main(String[] args) {
        Item item1=new Item(123, "Pencil", 5.50);
        Item item2=new Item(456,"Rubber",4.50);
        System.out.println("Item 1 Details:");
        item1.display();
        System.out.println("Total: "+item1.calculateTotal(2));
        System.out.println("Item 2 Details:");
        item2.display();
        System.out.println("Total: "+item2.calculateTotal(2));
        System.out.println("Total price to pay: "+(item1.calculateTotal(2)+item2.calculateTotal(2)));
    }    
}
