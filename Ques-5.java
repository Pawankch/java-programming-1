import java.util.*;
class Complex {

    void sum(int a1, int a2, int b1, int b2){
        int s1, s2;
        s1 = a1+b1;
        s2 = a2+b2;
        System.out.println("Sum of complex numbers is: "+s1+" + "+s2+"i");
    }

    void diff(int a1, int a2, int b1, int b2){
        int s1, s2;
        s1 = a1-b1;
        s2 = a2-b2;
        System.out.println("Difference of complex numbers is: "+s1+" + "+s2+"i");
    }

    void prod(int a1, int a2, int b1, int b2){
        int s1, s2;
        s1 = (a1*b1) - (a2*b2);
        s2 = (a1*b2) + (a2*b1);
        System.out.println("Product of complex numbers is: "+s1+" + "+s2+"i");
    }

    public static void main(String[] args) {
        int n1,n2,m1,m2;
        Scanner sc=new Scanner(System .in);
        System.out.println("Enter real and imaginary part of first number:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Enter real and imaginary part of second number:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        Complex c1= new Complex();
        c1.sum(n1, n2, m1, m2);
        c1.diff(n1, n2, m1, m2);
        c1.prod(n1, n2, m1, m2);
    }
}