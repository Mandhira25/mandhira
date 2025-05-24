package nrcm;
interface Bmwcar{
	void Model();
}
class Practice1{
	public void  price() {
		System.out.println("price:75,90,000");
			}
}
class Practice2 extends Practice1 implements Bmwcar{
	public void color() {
		System.out.println("Black");
	}
	public void Model() { 
		System.out.println("Bmwx5 ");
	}
}
class Practice3 extends Practice2{
	public void speed() {
		System.out.println("250 kmph");
	}
	
}

public class Ques3 {

	public static void main(String[] args) {
		Practice2 p1=new Practice2();
		Practice3 m1=new Practice3();
		p1.Model();
		m1.speed();
		p1.color();
		p1.price();

	}

}
