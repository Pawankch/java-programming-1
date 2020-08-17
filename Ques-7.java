import java.util.Scanner;

class Triangle {
	 
	 float Area(float a,float b,float c)
	 {
		 float s=(a+b+c)/2;
		 return (float) Math.sqrt(s*(s-a)(s-b)(s-c));
	 }

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 Triangle tr=new Triangle();
		 float a=sc.nextFloat();
		 float b=sc.nextFloat();
		 float c=sc.nextFloat();
		 System.out.println(tr.Area(a, b, c));
		
	}

}