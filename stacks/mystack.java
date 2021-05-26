package stacks;

import linkedLst.MyLinkedList;

public class mystack {
	
	
	
	
	MyLinkedList stack=new MyLinkedList();

	void push(int e) {
		stack.addData(e);
	}
	
	int pop() {
		return stack.remove();
	}
	
	int peek() {
		return stack.seetop();
	}
}
