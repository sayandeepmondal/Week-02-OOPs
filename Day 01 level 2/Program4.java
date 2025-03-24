import java.util.Scanner;
class MovieTicket{
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName,int seatNumber,Double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
        this.isBooked=false;
    }
    public void  bookTicket(){
        if(!isBooked){
            isBooked=true;
            System.out.println("Ticket Booked Successfully!!!");
        }else System.out.println("Seat is already booked");
    }
    public void displayTickets(){
        System.out.println("Movie: "+movieName);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price: "+price);
        System.out.println("Ticket Status: "+(isBooked? "Booked":"Available"));
    }
}
public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Movie:");
        String movie=sc.nextLine();
        System.out.println("Enter Seat Number:");
        int seat=sc.nextInt();
        System.out.println("Price:");
        double price=sc.nextDouble();
        MovieTicket ticket1=new MovieTicket(movie,seat,price);
        System.out.println("Do you want to book the ticket? Yes/No");
        sc.nextLine();
        String response=sc.nextLine();
        if(response.equalsIgnoreCase("Yes")){
            ticket1.bookTicket();
        }
        ticket1.bookTicket();
        ticket1.displayTickets();
        sc.close();
        
    }
}
