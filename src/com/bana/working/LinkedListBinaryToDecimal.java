package com.bana.working;

import java.util.List;

/*
 * have a linked list where each node represents a binary digit (0 or 1). 
 * The goal of the binaryToDecimal function is to convert this binary number, 
 * represented by the linked list, into its decimal equivalent.
 */
/*
 * Example Execution with Binary 101:

Start with num = 0.

Process 1 (from the head of the linked list): num = 0 * 2 + 1 = 1

Process 0: num = 1 * 2 + 0 = 2

Process 1: num = 2 * 2 + 1 = 5

Return num, which is 5.
 */
public class LinkedListBinaryToDecimal {
	
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
	public LinkedListBinaryToDecimal(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
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
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
	}
	
	public int binaryToDecimal() {
		if(length == 0) {
			return 0;
		}
		Node currentNode = head;
		int num = 0;
		while(currentNode != null) {
			num = (num * 2) + currentNode.value;
			currentNode = currentNode.next;
		}
		return num;
	}
	public static void main(String[] args) {
		LinkedListBinaryToDecimal mylist = new LinkedListBinaryToDecimal(1);
		mylist.append(1);
		mylist.append(0);
		mylist.append(1);

		
		System.out.println("value of 1101 after convertion: "+ mylist.binaryToDecimal());

	}

}
