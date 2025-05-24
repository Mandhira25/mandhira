package Assign;
import java.util.*;
public class Exception3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b values");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("the divison is" + c);
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic exception is" +e.getMessage());
				
			}catch(InputMismatchException e) {
				System.out.println("Input Mismatch exception:please enter valid integers");
			}
	}

}


