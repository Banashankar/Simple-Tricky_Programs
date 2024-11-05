package com.bana.working;

/*
 * Given singly LL with integer values and these values may be duplicate.
 * 
 * Note: LL class(for example: RemoveDuplicatesNoTail) does not have a "tail"
 * 
 * Example: 1->2->3->1->4->2->5
 * output: 1->2->3->4->5
 */
public class RemoveDuplicatesNoTail {
	private Node head;
	private int length;
	
	public class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public RemoveDuplicatesNoTail(int value) {
			Node newNode = new Node(value);
			head = newNode;
			length = 1;
		}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		length++;
	}
	
	public void removeDuplicates() {
		//node variable to point to present head
		Node current = head;
		
		//while loop to iterate the whole list
		while(current != null) {
			
			//if it is not equal to null then create another node variable to point to current node.
			Node runner = current;
			
			//so use another loop to check with the newly created node variable whether its next is pointing to null or not.
			while(runner.next != null) {
				
				//now check whether value of runner next element value is equal to current element value
				if(runner.next.value == current.value) {
					
					//if it is same then skip that element and assign the runner next which will point to runner next next(which will skip runner next)
					runner.next = runner.next.next;
					
					//if we decrease the length by 1 the element will be removed
					length--;
				}
				// if its not equal
				else {
					
					//then make sure that whatever the variable created to assign to current move one step ahead
					runner = runner.next;
				}
			}
				// and move the current to next point
				current = current.next;
		}
	}
	public void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		
		RemoveDuplicatesNoTail myList = new RemoveDuplicatesNoTail(1);
		myList.append(1);
		myList.append(2);
		myList.append(3);
		myList.append(3);
		myList.append(4);
		myList.append(2);
		myList.append(5);
		
		System.out.println("LL before removing duplicates: ");
		myList.printList();
		
		
		System.out.println("LL after removing duplicates:");
		myList.removeDuplicates();
		myList.printList();

	}

}
