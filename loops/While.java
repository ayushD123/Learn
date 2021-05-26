package loops;

import java.util.Scanner;

//TO FIND SUM OF DIGITS

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0) {
			
			int LastDigit=temp%10;
			temp=temp/10;
			sum=sum+LastDigit;
			
		}
		
		System.out.println(sum);

	}

}
