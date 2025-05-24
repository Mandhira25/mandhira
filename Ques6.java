package nrcm;
interface jewwls{
	void hand();
}
class chains{
	public void event() {
		System.out.println("thegeee");
	}
}
class leg extends chains implements jewwls{
	public void Leg() {
		System.out.println("Pattilu");
	}
	public void hand() {
		System.out.println("Bangels");
	}
}
class body{
	public void Body() {
		System.out.println("Vadanam");
	}
}
class ears extends body{
	public void Ears() {
		System.out.println("Ear rings");
	}
}
public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chains c1=new chains();
		leg l1=new leg();
		body b1=new body();
		c1.event();
		l1.Leg();
		l1.hand();
		b1.Body();
		
		

	}

}
