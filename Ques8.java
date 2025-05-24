package nrcm;
interface Softdrinks{
	void drinks();
}
class Brand implements Softdrinks{
	public void marketing() {
		System.out.println("Coca");
	}
	public void drinks() {
		System.out.println("Sprite");
	}
}
interface cooldrinks{
	void cool();
}
class Taste implements cooldrinks{
	public void tasting() {
		System.out.println("Soar to taste");
	}
	public void cool() {
		System.out.println("It is very cool");
	}
}
interface Milkshakes{
	void shakes();
	
}
class Juices implements Milkshakes{
	public void juices() {
		System.out.println("Lemon");
	}
	public void shakes() {
		System.out.println("Oreo shake");
	}
}



public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brand b1=new Brand();
		Taste t1=new Taste();
		Juices j1=new Juices();
		b1.marketing();
		b1.drinks();
		t1.tasting();
		t1.cool();
		j1.juices();

	}

}
