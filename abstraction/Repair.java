package abstraction;

public class Repair {
	
	public static void repair(Car car) {
		System.out.println("your car is repaired");
	}
		
//	public static void repair(BMW car) {
//			System.out.println("your car is repaired");
//		
//	}

	public static void main(String[] args) {
		
		Alto alto=new Alto();
		BMW bmw=new BMW();
		
	repair(alto);
	repair(bmw);

	}

}
