package Assign;
import java.util.*;

public class Exception4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer as string");
		String n=sc.nextLine();
		try
		{
			int a=Integer.parseInt(n);
			System.out.println("parsed integer" + a);
		}catch(NumberFormatException e) {
			System.out.println("error:the input is not a valid integer");
		}

	}

}


