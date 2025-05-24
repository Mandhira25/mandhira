package Assign;
import java.net.BindException;
public class Exception5 {
		public static void main(String[] args) {
			 try {
		            if (args.length == 0) {
		                throw new BindException("No coupon code provided.");
		            }

		            String copcd = args[0];
		            String validCoupon = "COUPON123";

		            if (copcd.equals(validCoupon)) {
		                System.out.println("Coupon code applied successfully");
		            } else {
		                throw new Exception("Invalid Coupon Code");
		            }

		        } catch (Exception e) {
		            System.out.println("Invalid Attempt  to apply coupon: " + e.getMessage());
		        } finally {
		            System.out.println("Thank you for shopping with us!!");
		        }

		}

	}





