package com.sgraham.DoublyLinkedList;

public class DLLTest {

	public static void main(String[] args) {
		
		DLL dll = new DLL();
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(35);
		Node n4 = new Node(50);
		Node n5 = new Node(35);
		Node n6 = new Node(20);
		Node n7 = new Node(10);
		
		dll.push(n1);
		dll.push(n2);
		dll.push(n3);
		dll.push(n4);
		dll.push(n5);
		dll.push(n6);
		dll.push(n7);
		
//		dll.printValuesForward();
//		System.out.println(dll.head.value);
//		System.out.println(dll.tail.value);
//		System.out.println("\n--------------------------------------------------\n");
//		dll.printValuesBackward();
//		System.out.println("\n--------------------------------------------------\n");
//		System.out.println("Popped value is " + dll.pop().value);
//		dll.printValuesForward();
//		System.out.println("\n--------------------------------------------------\n");
//		System.out.println(dll.contains(80));
//		System.out.println(dll.contains(22));
		System.out.println("Size of dll is " + dll.size());
		
		System.out.println("\n--------------------------------------------------\n");
		
		Node n8 = new Node(110);
		dll.insertAt(n8, 5);
		dll.printValuesForward();
		System.out.println("Head: " + dll.head.value);
		System.out.println("Tail: " + dll.tail.value);
		
		System.out.println("\n--------------------------------------------------\n");
		
		dll.removeAt(5);
		dll.printValuesForward();
		System.out.println("Head: " + dll.head.value);
		System.out.println("Tail: " + dll.tail.value);

		System.out.println("\n--------------------------------------------------\n");
		dll.isPalindrome();
	}

}
