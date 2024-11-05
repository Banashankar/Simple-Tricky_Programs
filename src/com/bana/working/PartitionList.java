//package com.bana.working;
//
//public class PartitionList {
//	private Node head;
//	private int length;
//	
//	public class Node{
//		int value;
//		Node next;
//		
//		public Node(int value) {
//			this.value = value;
//		}
//	}
//	public PartitionList(int value) {
//		Node newNode = new Node(value);
//		head = newNode;
//		length = 1;
//	}
//	public void append(int value) {
//		Node newNode = new Node(value);
//		if(length == 0) {
//			head = newNode;
//		}
//		else {
//			Node current = head;
//			while(current.next != null) {
//				current = current.next;
//			}
//			current.next = newNode;
//		}
//		length++;
//	}
//	public void partitionList(int x) {
//		if(length == 0) {
//			head = null;
//		}
//		Node lessHead = new Node(0);
//		Node equalHead = new Node(0);
//		Node greaterOrEqualHead = new Node(0);
//		
//		Node less = lessHead;
//		Node equal = equalHead;
//		Node greaterOrEqual = greaterOrEqualHead; 
//		
//		Node curr = head;
//		
//		while(curr != null) {
//			if(curr.value < x) {
//				less.next = curr;
//				less = less.next;
//			}
//			else if(curr.value == x) {
//				equal.next = curr;
//				equal = equal.next;
//			}
//			else {
//				greaterOrEqual.next = curr;
//				greaterOrEqual = greaterOrEqual.next;
//			}
//			curr = curr.next;
//		}
//		greaterOrEqual.next = null;
//		equal.next = greaterOrEqualHead.next;
//		less.next = equalHead.next;
//	}
//	 public void printList() {
//	        Node temp = head;
//	        while (temp != null) {
//	            System.out.println(temp.value);
//	            temp = temp.next;
//	        }
//	    }
//
//	public static void main(String[] args) {
//		 // Create a new LinkedList and append values to it
//        PartitionList ll = new PartitionList(3);
//        ll.append(5);
//        ll.append(8);
//        ll.append(10);
//        ll.append(2);
//        ll.append(1);
//
//        // Print the list before partitioning
//        System.out.println("LL before partitionList:");
//        ll.printList(); // Output: 3 5 8 10 2 1
//
//        // Call the partitionList method with x = 5
//        ll.partitionList(5);
//
//        // Print the list after partitioning
//        System.out.println("LL after partitionList:");
//        ll.printList(); // Output: 3 2 1 5 8 10
//
//	}
//
//}
