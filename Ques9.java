package nrcm;
interface Veggies{
	void color();
}
interface Taste1{
	void taste();
}
interface Place{
	void place();
}
interface Used extends Veggies,Taste1,Place{
	void used1();
}
class Soil implements Used{
	public void grown() {
		System.out.println("In ground");
	}
	public void color() {
		System.out.println("Green");
	}
	public void taste() {
		System.out.println("Taste is good");
		
	}
	public void place() {
		System.out.println("Grown in red soil");
	}
	public void used1() {
		System.out.println("used for healthy");
	}
	
	
}

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soil s1=new Soil();
		s1.color();
		s1.grown();
		s1.place();
		s1.taste();

	}

}
