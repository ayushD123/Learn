package arraylist;

import java.util.List;
import java.util.ArrayList;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		
		marks.add(5);
		marks.add(0);
		
		Object x[]=marks.toArray();
		System.out.println(x[1]);
		
		System.out.println(marks);

	}

}
