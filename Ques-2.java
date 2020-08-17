import java.util.Scanner;

class Rectangle
{
    public static int height;
    public static int width;

    public void display()
    {
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
class RectangleArea extends Rectangle
{
    Scanner sc = new Scanner(System.in);
    public void read_input()
    {
        System.out.println("Enter Width of Rectangle");
        this.width = sc.nextInt();
        System.out.println("Enter Height of Rectangle");
        this.height = sc.nextInt();
    }
     //Method Overloading
     @Override
    public void display()
    {
        System.out.println(width* height);
    }
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        RectangleArea ra = new RectangleArea();
        
        ra.read_input();
         
        //System.out.println(width+" "+height);
        r.display();
        ra.display();
    }
}