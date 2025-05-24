package Assign;

public class Exception1 {
	 public static void main(String[] args) {
	      int[] arr = {10, 20, 30, 40, 50};
	        try {
	            int index = Integer.parseInt(args[0]);
	            System.out.println("Command line args " + index);
	            System.out.println("The element present at " + index + " is " + arr[index]);
	        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
	            System.out.println("Command line args " + (args.length > 0 ? args[0] : "none"));
	           
	            System.out.println("The mentioned index is out of bounds");
	        }
	    }
	}


