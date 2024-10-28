package com.bana.working;

public class FloyidsTortoiseHareAlgorithm {
	private Node head;
	private Node tail;
	int size;
	
	public class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	 public FloyidsTortoiseHareAlgorithm(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        tail = newNode;
	        size = 1;
	    }
	 public void append(int value) {
		 Node newNode = new Node(value);
		 if(size == 0) {
			 head = newNode;
			 tail = newNode;
		 }
		 else {
			 tail.next = newNode;
			 tail = newNode;
		 }
		 size++;
	 }
	 public boolean isEven() {
		 return size % 2 == 0;
	 }
	 public boolean isOdd() {
		 return size % 2 != 0;
	 }
	 
	 public Node findMiddleNode() {
		 if(size == 0) {
			 return null;
		 }
		 Node temp = head;
		 Node pre = head;
		 
		 if(isOdd()) {
			 int count = 0;
			 int steps = size/2;
			 while(count < steps) {
				 pre = pre.next;
				 count++;
			 }
//			 while(temp != null && temp.next != null) {
//				 pre = pre.next;
//				 temp = temp.next.next;
//			 }
		 }
		 else if(isEven()) {
			 int count = 0;
			 int steps = size / 2;
			 
			 while(count < steps) {
				 pre = pre.next;
				 count++;
			 }
		 }
			 return pre;
	 }
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.value);
	            temp = temp.next;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloyidsTortoiseHareAlgorithm myLinkedList = new FloyidsTortoiseHareAlgorithm(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		
		
		System.out.println("List for odd: \n");
		myLinkedList.printList();
		
		System.out.println("middel node found for odd:" + myLinkedList.findMiddleNode().value);
		
		myLinkedList.append(6);
		System.out.println("List for even: \n");
		myLinkedList.printList();
		System.out.println("middle node found for even:" + myLinkedList.findMiddleNode().value);

	}

}
