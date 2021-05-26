package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method istub
		
		int arr[]= {4,-1,8,1,5};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i;j<n-1;j++) {
				if(arr[minindex]>arr[j]){
					minindex=j;
					
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
			
		}
		
		for(int x:arr) {
			System.out.print(x+" ");
			
		}
		
		

	}

}
