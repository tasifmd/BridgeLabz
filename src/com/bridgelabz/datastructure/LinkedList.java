package com.bridgelabz.datastructure;

public class LinkedList {
	Node head = null;
	/**
	 * Function : Function which Performs Insert operation on LinkedList
	 * @param data : String Value
	 */
	public void insertAtLast(String data)
	{
		Node node = new Node();
		node.data = data;
		if(head == null)
		{
			head = node;
			node.next = null;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			node.next = null;
			n.next = node;
		}
	}
	/**
	 * Function : Function Which Delete Elements from Linked List 
	 * @param element : String Value
	 */
	public void delete(String element)
	{
		Node n = head;
		Node prev = head;
		if(n.data.equals(element)) {
			head = n.next;
			return;
		}
		while(n.next!=null)
		{			
			if(element.equals(n.data))
			{
				prev.next = n.next;
				return;
			}
			prev = n;
			n=n.next;
		}
		prev.next = null;
	}
	/**
	 * Function : To delete element at first
	 */
	public String deleteAtFirst()
	{
		String item;
		Node n = head;
		head = n.next;
		item = n.data;
		return item;
	}
	/**
	 * 
	 */
	public String deleteAtLast()
	{
		if(head == null)
			return null;
		else
		{
			Node n = head;
			Node prev = head;
			while(n.next!=null)
			{
				prev = n;
				n = n.next;
			}	
			String data = n.data;
			prev.next = null;
			return(data);
		}
	}
	/**
	 * Function : Function to Sort a Linked List
	 */
	public void sortList()
	{
		Node n = head;
		Node prev;
		prev=n.next;
		while(n.next!=null)
		{
			while(prev.next!=null)
			{
				int a = Integer.parseInt(n.data);
				int b = Integer.parseInt(prev.data);
				if (a>b) 
	    		{
	    			int t = a;
	    			n.data=String.valueOf(b);
	    			prev.data = String.valueOf(t);
	    		}
				prev=prev.next;
			}	
			n=n.next;
			prev=n.next;
		}
	}
	//It is a Function which displays Linked List 
	public void show()
	{
		Node n = head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.print(n.data+" ");
	}
	
	public String getFirst()
	{
		Node n = head;
		if(n.next==null) {
			head=null;
			return n.data;
		}
		head=n.next;
		return n.data;
	}
	//Function to search element in a Linked List
	public boolean search(String element)
	{
		Node n =head;
		while(n!=null)
		{
			if(element.equals(n.data))
				return true;
			n = n.next;
		}
		return false;
	}
	//It is a which which check whether a list is empty or not
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	public String getElement(int index) {
		Node n = head;
		int count = 0;
		while(n!=null)
		{
			if(count == index)
				return n.data;
			count ++;
			n = n.next;
		}
		return null;
	}
	
	public int size() {
		Node n = head;
		int count = 0; 
		while(n!=null) {
			count ++;
			n = n.next;
		}
		return count;
	}
}
