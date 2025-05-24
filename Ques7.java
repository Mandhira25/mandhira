package nrcm;
interface Ice{
	void brand();
}
interface Location{
	void place();
}
interface Price extends Ice,Location{
	void price();
}
class Flavours{
	public void flav() {
		System.out.println("Chocolate");
	}
	
}
class Marketing extends Flavours implements Price{
	public void market() {
		System.out.println("Very good");
	}
	public void brand() {
		System.out.println("Cream Stone");
	}
	public void place() {
		System.out.println("Komaplly");
	}
	public void price() {
		System.out.println("Average");
	}
}

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flavours f1=new Flavours();
		Marketing m1=new Marketing();
		m1.brand();
		m1.place();
		m1.market();
		f1.flav();
		m1.price();

	}

}
