import java.util.ArrayList;
class Library {
    private String libraryName;
    private ArrayList<Book> books;
    public Library(String libraryName){
        this.libraryName=libraryName;
        this.books=new ArrayList<>();
    }
    public void addBooks(Book book){
        books.add(book);
        System.out.println("Book added to "+libraryName+": "+book.getTitle());
    }
    
    public void displaydetails(){
        System.out.println("Library: "+libraryName);
        if(books.isEmpty()) System.out.println("No books available");
        else{
            System.out.println("Books in the library:");
            for(Book book:books){
                book.showBookDetails();
            }
        }
    }
}
class Book{
    private String title;
    private String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void showBookDetails(){
        System.out.println("Tilte: "+title+", Author: "+author);

    }
    
}
public class Program1{
    public static void main(String[] args) {
        Book book1=new Book("The Alchemist", "Paulo Coelho");
        Book book2=new Book("To Kill a Mockingbird", "Harper Lee");
        Library library1=new Library("City Library");
        Library library2=new Library("College Library");
        library1.addBooks(book1);
        library2.addBooks(book2);
        library2.addBooks(book1);
        library1.displaydetails();
        library2.displaydetails();

    }
}