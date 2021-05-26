package oops;

class car{
	int seats,topspeed;
	String colour,type;
	boolean turbo;
	
	
	public void desp(){
		System.out.println("Its a "+type+" of "+seats+" seater car");
	}
	public void sport() {
		System.out.println("This "+colour+" beast runs at "+topspeed+" KMPH");
		
	}
	public void hasturbo() {
		System.out.println("it has turbo-"+turbo);
	}
}

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car audi=new car();
		car wrangler=new car();
		
		audi.seats=4;
		audi.colour="white";
		audi.topspeed=155;
		audi.type="sedan";
		audi.turbo=true;
		
		wrangler.seats=2;
		
		audi.hasturbo();
		wrangler.hasturbo();
		
//		audi.desp();
//		wrangler.desp();
//		audi.sport();
//		wrangler.sport();
		
		
		
		

	}

}
