package nrcm;
interface employee{
	void name();
}
interface id extends employee{
	void Id();
}
class Scene1 implements id{
	public void display() {
		System.out.println("Employee Details");
	}
	public void name() {
		System.out.println("EmployeeName:GangaReddy");
	}
	public void id() {
		System.out.println("Employee id:23467");
	}
	@Override
	public void Id() {
		// TODO Auto-generated method stub
		
	}
}
class Scene2 implements id{
	public void num() {
		System.out.println("Employee num:8976543210");
	}
	public void name() {
		System.out.println("Gangareddy");
	}
	public void id() {
		System.out.println("23467");
	}
	@Override
	public void Id() {
		// TODO Auto-generated method stub
		
	}
}
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scene1 s1=new Scene1();
Scene2 s2=new Scene2();
s1.display();
s1.name();
s1.id();
s2.num();
//s2.name();
//s2.id();

}
}
