package nrcm;
interface Airlines{
	void airlines();
}
interface Brand1{
	void brand1();
}
interface Capacity{
	void capacity();
}
class Cost implements Airlines,Brand1,Capacity{
	public void cost() {
		System.out.println("Cost is Normal");
	}
	public void airlines() {
		System.out.println("Vistara");
	}
	public void brand1() {
		System.out.println("Popular");
	}
	public void capacity() {
		System.out.println("Max 150 people");
	}
}
interface Runway{
	void runway();
}
class Fuel extends Cost implements Runway{
	public  void fuel() {
		System.out.println("10000 liters");
	}
	public void runway() {
		System.out.println("Hyderabad Runway");
	}
}
public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cost c1=new Cost();
		Fuel f1=new Fuel();
		c1.airlines();
		c1.brand1();
		c1.capacity();
		f1.fuel();
		f1.runway();

	}

}
