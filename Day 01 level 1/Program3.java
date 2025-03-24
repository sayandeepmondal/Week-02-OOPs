class Books{
    private String title;
    private String author;
    private int price;
    public Books(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

}
public class Program3 {
    public static void main(String[] args) {
        Books book1=new Books("Its Ends With Us","Harshi Chowdary",250);
        Books book2=new Books("Harry Potter","J K Rowling",1500);
        System.out.println("Book1 Details:");
        book1.display();
        System.out.println("Book2 Details:");
        book2.display();
    }

    
}
