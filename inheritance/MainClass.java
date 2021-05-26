package inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher();
		t.name="Ayush"; //teacher is child of person hence protected variable 'name' can be accessed by it
		t.eat();
		t.teach();
		t.walk();
		
		Singer s=new Singer();
		s.name="Sanu";
		s.eat();
		s.sing();
		s.walk();

	}

}
