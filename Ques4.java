package nrcm;
interface Amazon{
	void Amazonprime();
}
interface Entertainment{
	void fun();
}
class Practice4{
	public void shopping() {
		System.out.println("online marketplace ");
	}
}
class place extends Practice4 implements Amazon,Entertainment{
	public void places() {
		System.out.println("Hyderabad,Bangalore");
	}
	public void fun() {
		System.out.println("watching movies,listening songs" );
	}
	public void Amazonprime() {
		System.out.println("free membership ");
	}
}

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Practice4 k1 =new Practice4();
		place p1=new place();
		p1.Amazonprime();
		p1.fun();
		p1.places();
		k1.shopping();

	}

}
