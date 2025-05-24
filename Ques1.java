package nrcm;
interface studentid{
	void id();
}
interface studentname{
	void name();
}
interface  studentsec extends studentid,studentname{
	void Studentsec();
}

public class Ques1 implements studentsec {
	public void display() {
		System.out.println("All details");
	}
	public void id() {
		System.out.println("Id: 243");
	}
public void name() {
	System.out.println("Name:mandhira");
}
public void sec() {
	System.out.println("Sec:cse b");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ques1  d1=new Ques1();
d1.display();
d1.id();
d1.name();
d1.sec();
	}
	@Override
	public void Studentsec() {
		// TODO Auto-generated method stub
		
	}

}
