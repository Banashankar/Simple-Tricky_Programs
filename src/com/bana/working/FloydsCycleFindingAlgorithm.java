package com.bana.working;

public class FloydsCycleFindingAlgorithm {
	private Node head;
	private Node tail;
	private int length;
	
	public class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	public FloydsCycleFindingAlgorithm(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public Node getHead() {
		return head;
	}
	
	public int getLength() {
		return length;
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	//method to check LinkedList has loop
	public boolean hasLoop() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
		
	}
	
	//to print the elements
	public void printList() {
		Node temp = head;
		while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
	}

	public static void main(String[] args) {
		FloydsCycleFindingAlgorithm myList = new FloydsCycleFindingAlgorithm(11);
		myList.append(3);
		myList.append(23);
		myList.append(5);
		myList.append(7);
		
//		System.out.println("LinkedList not having loop: \n");
//		myList.printList();
		
		myList.getTail().next = myList.getHead().next;
		System.out.println("Has Loop:\n");
		System.out.println(myList.hasLoop());
		
		

	}

}
