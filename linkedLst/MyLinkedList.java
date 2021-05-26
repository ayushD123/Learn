package linkedLst;

public class MyLinkedList {
	
	public boolean isEmpty() {
		return head==null;
	}

	node head;
	
	public void addData(int dataOfNewNode) {    //adds attributes to new node inserted at last 
		node newNode=new node(dataOfNewNode);
		
		if(head==null) {
			head=newNode;
		}
		else {
		node temp;
		temp=head;
		while(temp.next!=null) {  //LOOP TO GO TO LAST NODE WHICH HAS NEXT=NULL
			temp=temp.next;
		}
		temp.next=newNode;  //transfer all attribute of new node to temp i.e last node
	}
	}
	
	public int remove() {
		
		node temp=head;
		
		if(isEmpty()) {
			System.out.println("removing from empty list");
		}
		if(temp.next==null) {  //only one element
			node toremove= head;
			head=null;
			return toremove.data;
		}
		while(temp.next.next!=null) {  //go to second last node and remove last node
			temp=temp.next;
			}
			node toremove=temp.next;
			temp.next=null;
			return toremove.data;
		
		}
		
	public int seetop() {
		
		node temp=head;
		
		if(isEmpty()) {
			System.out.println("peeking from empty list");
		}
		while(temp.next!=null) { // go to last element
			temp=temp.next;
			}

			return temp.data;
		}
		
	
	
	void print() {
		
		node temp=head;
		System.out.print("[");
		while(temp!=null) {  //LOOP TO GO TO LAST NODE WHICH HAS Temp=null
			System.out.print(temp.data);
			if(temp.next!=null) {
				System.out.print(",");
			}
			temp=temp.next;
			
		}
		System.out.print("]");
		
	}
	
	
	
	
	static class node{
		
		int data;
		node next;
		
		public node(int newdata) { //new node at last
			data=newdata;
			next=null;
		}
	}
}
//	staic node method() {
//		
//	}
//}
