package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
//		Pet p=d;
		Pet p=new Pet();
		
		
		
		
		d.walk();
		p.walk();
		
		System.out.println(d.name);
		System.out.println(p.name);
	}

}
