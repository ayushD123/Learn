package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Ur Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter ur array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				
				if(a[j+1]<a[j]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int item:a) {
			System.out.print(item+" ");
		}
	}

}
