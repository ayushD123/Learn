package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=1;
		
		do {
			
			n=sc.nextInt();
			System.out.println("Your Entered Number Is "+n);
			
		}while(n!=0);
	}

}
