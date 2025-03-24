class Circle{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double findCircumference(){
        return 2*3.14*radius;
    }
    public double findArea(){
        return 3.14*radius*radius;
    }
}
public class Program2{
    public static void main(String[] args) {
        Circle c1=new Circle(7);
        Circle c2=new Circle(14);
        System.out.println("Circle 1 Circumference: "+c1.findCircumference()+" and Area: "+c1.findArea());
        System.out.println("Circle 2 Circumference: "+c2.findCircumference()+" and Area: "+c2.findArea());
    }
}
