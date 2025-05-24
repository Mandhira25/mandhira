package Assign;
import java.util.*;
	class InvalidException extends Exception{
		public InvalidException(String message) {
			super(message);
		}
	}

	public class Exception2 {

		public static void main(String[] args) {
			try {
				int id=Integer.parseInt(args[0]);
				System.out.println("Command line args" + id);
				if(id<0||id>999) {
					throw new InvalidException("Invalid employee id");
				}
				System.out.println("valid employee id");
			}catch(InvalidException e) {
				System.out.println("exception caught");
				System.out.println(e.getMessage());
							
			}catch(NumberFormatException e) {
				System.out.println("Invalidinput");
			}

		}

	}



