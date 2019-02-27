package com.bridgelabz.datastructure;
public class Test {

	public static void main(String[] args) {
		CustomLinkedList li = new CustomLinkedList();
		String s = "Tasif";
		li.add(li, "Tasif");
		li.add(li, "Mohammed");
		li.add(li, "Perweez");
		if(li.isAvailable(li.head, s)) {
			System.out.println("Found");
		}
		else {
			System.out.println("not Found");
		}
		li.printList(li);
	}

}
