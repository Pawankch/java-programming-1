import java.util.*;

//Interface for Add
interface Addable
{
    public int addFunction(int a, int b);
}

//Interface for Difference
interface Differencable
{
    public int difference(int a, int b);
}

//Interface for product
interface Productable
{
    public int productOf(int a, int b);
}

//Interface for Safe Division
interface SafeDivision
{
    public int safeDivision(int a, int b);
}
class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b= sc.nextInt();
       Addable a1 = (a,b) -> { return a+b;};
       
       Differencable d1 = (a,b)->{ return a-b;};

       Productable  p1 = (a, b)->{return a*b;};
       
       SafeDivision s1 = (a, b)->{
           if(b!=0)
           {
               return a/b;
           }
           else
           {
               return 0;
           }
       };

       //Input through Scanner

       int  a = sc.nextInt();
       int  b = sc.nextInt();

       //Calling functions

        System.out.println(a1.addFunction(a, b));
        System.out.println(d1.difference(a, b));
        System.out.println(p1.productOf(a, b));
        System.out.println(s1.safeDivision(a, b));

    }
}