package inheritance;

public class Singer extends Person {
	
	public void sing() {
		System.out.println(name+" is singing");
	}
	
	public void walk() {
		System.out.println("Singer "+name+" is walking");
	}

}
