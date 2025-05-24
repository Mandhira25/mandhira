package nrcm;
interface Flower{
	void flowers();
}
interface Fruit{
	void fruits();
	
}
class Practice5{
	void smell() {
		System.out.println("good");
	}
}
class Practice6 extends Practice5 implements Flower,Fruit{
	public void benefits() {
		System.out.println("healthy");
	}
	public void flowers() {
		System.out.println("rose,sunflower,lilly");
	}
	public void fruits() {
		System.out.println("apple,grapes,banana");
	}
}
class Practice7 extends Practice6{
	public void prices() {
		System.out.println("");
	}
}

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice5 p5=new Practice5();
		Practice6 p6=new Practice6();
		Practice7 p7=new Practice7();
		
		p5.smell();
		p6.benefits();
		p6.fruits();
		p6.flowers();

	}

}
