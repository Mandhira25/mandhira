package Assign;
import java.util.*;
class DeviceFailureException extends Exception{
	public DeviceFailureException(String message) {
		super(message);
	}
}


public class Exception6 {
	public static void use(String Printer) throws DeviceFailureException {
		if(Printer.equalsIgnoreCase("Printer1")||Printer.equalsIgnoreCase("Printer3")) {
			System.out.println("Avaliable");
		}else {
			throw new DeviceFailureException("Device Failure:Not avaliable");
		}
				
	}

	public static void main(String[] args) {
		try {
			String Printer=args[0];
			use(Printer);
			
		}catch(DeviceFailureException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("error message" + e.getMessage());
		}

	}

}


