import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception 
{ 
    public MyException(InputMismatchException e) 
    { 

        System.out.println("Only number can be entered");
    } 
} 

public class CustomException {
	
	float conv(float n) 
	{
		return (float) (0.67*n);
	}
	
	public static void main(String[] args) throws MyException {
		CustomException n=new CustomException();
		Scanner sc=new Scanner(System.in);
		float num=0.0f;
		System.out.println("Enter Number");
		try
		{
		    num=sc.nextFloat();
		    
		}
	
		catch(InputMismatchException e)
		{
			throw new MyException(e);
		}
		System.out.println(n.conv(num));
	}

}
