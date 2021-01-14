package com.sgraham.DoublyLinkedList;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
		if (this.head == null ) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node lastNode = this.tail;
			lastNode.next = newNode;
			newNode.previous = lastNode;
			this.tail = newNode;
		}
	}
	public void printValuesForward() {
		Node runner = this.head;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}
//  In this assignment, you will implement common methods for Doubly Linked Lists
//
//  X void printValuesBackward(): This method prints the values of the nodes from the tail to the head.
//  X Node pop(): This method removes the last node of our DLL and returns it.
//  X boolean contains(Integer value): This method returns a boolean whether the value in the argument is in the list or not
//	Return true if the value exists, else, return false.
//  X int size(): Returns the number of nodes in the list.
	
	public void printValuesBackward() {
		Node runner = this.tail;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.previous;
		}
	}
	public Node pop() {
		Node lastNode = this.tail;
		Node newTail = lastNode.previous;
		this.tail = newTail;
		newTail.next = null;
		return lastNode;
	}
	public boolean contains(Integer value) {
		Node runner = this.head;
		while (runner != null) {
			if (runner.value == value) {
				return true;
			}
			runner = runner.next;
		}
		return false;
	}
	public int size() {
		int size = 0;
		Node runner = this.head;
		while (runner != null) {
			size++;
			runner = runner.next;
		}
		return size;
	}

//  If you completed all the methods above, challenge yourself and try the following:
//
//	X void insertAt(Node newNode, int index): Inserts a node at a specific index. 
//	For example, let's say that we have 3 nodes in our list. If we call insertAt(newNode, 1), the newNode should be inserted
//	right after the head. (head is index 0)
//	X void removeAt(int index): This method removes a node at an index. For example, let's say that we have 3 nodes in our list.
//	If we call removeAt(1), the middle node is removed. (head is index 0)
//	X boolean isPalindrome(): This method returns a boolean whether the node is a palindrome or not.
//	Return true if it is a palindrome, else, return false.
	
	public void insertAt(Node newNode, int index) {
		if (index == 0) {
			Node insertNode = this.head;
			newNode.next = insertNode;
			insertNode.previous = newNode;
			this.head = newNode;
		}
		else if (index == this.size()) {
			this.push(newNode);
		}
		else if (index > this.size()) {
			System.out.println("Error. index out of bounds.");
		}
		else {
			int ind = 1;
			Node runner = this.head.next;
			while (ind < index) {
				runner = runner.next;
				ind++;
			}
			newNode.next = runner;
			newNode.previous = runner.previous;
			runner.previous.next = newNode;
			runner.previous = newNode;
		}
	}
	public void removeAt(int index) {
		if (index == 0) {
			Node newHead = this.head.next;
			this.head = newHead;
			newHead.previous = null;
		} else if (index == this.size() - 1) {
			this.pop();
		} else if (index >= this.size()) {
			System.out.println("Error. Index out of bounds.");
		} else {
			int ind = 1;
			Node runner = this.head.next;
			while (ind < index) {
				runner = runner.next;
				ind++;
			}
			runner.previous.next = runner.next;
			runner.next.previous = runner.previous;
		}
	}
	
	public boolean isPalindrome() {
		// is a string version of the first half the same as a string version of the second half backwards?
		int halfLength = this.size() / 2; // int division - drops the remainder - (ignoring the middle index of an odd-sized list)
		String firstHalf = "";
		String secondHalf = "";
		
		Node runner = this.head;
		for (int i = 0; i < halfLength; i++ ){
			firstHalf = firstHalf + runner.value;
			runner = runner.next;
		}
		
		runner = this.tail;
		for (int i = 0; i < halfLength; i++ ) {
			secondHalf = secondHalf + runner.value;
			runner = runner.previous;
		}

//		System.out.println("First Half: " + firstHalf);
//		System.out.println("Second Half: " + secondHalf);
		
		if (firstHalf.equals(secondHalf)) {
			System.out.println("Palindrome!");
			return true;
		} else {
			System.out.println("Not a palindrome.  :( ");
			return false;
		}
	}
	
}
