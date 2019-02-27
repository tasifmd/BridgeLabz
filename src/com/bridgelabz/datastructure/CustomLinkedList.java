package com.bridgelabz.datastructure;

public class CustomLinkedList {
	Node head;
    static class Node { 
        String data; 
        Node next;  
        Node(String d) { 
            data = d; 
            next = null; 
        } 
    }
    public CustomLinkedList add(CustomLinkedList list,String data) { 
        Node newNode = new Node(data); 
        newNode.next = null;
        if (list.head == null) { 
            list.head = newNode; 
        } 
        else {
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = newNode; 
        }
        return list; 
    }
    public void printList(CustomLinkedList list) { 
        Node currNode = list.head; 
        while (currNode != null) {
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
        System.out.println("\n"); 
    } 
    public CustomLinkedList remove(CustomLinkedList list, String key) { 
        Node currNode = list.head, prev = null; 
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next;
            System.out.println(key + " found and deleted"); 
            return list; 
        }
        while (currNode != null && currNode.data != key) { 
            prev = currNode; 
            currNode = currNode.next; 
        } 
        if (currNode != null) { 
            prev.next = currNode.next;
            System.out.println(key + " found and deleted"); 
        } 
        if (currNode == null) { 
            System.out.println(key + " not found"); 
        }
        return list; 
    } 
    
    
    public boolean isAvailable(Node head, String x) 
    { 
    	if (head == null) 
            return false; 
        if (head.data == x) 
            return true; 
        return isAvailable(head.next, x); 
    }
    
    public int size() 
    { 
        Node temp = head; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        } 
        return count; 
    } 
    
    public String getElement(int index) 
    { 
        Node current = head; 
        int count = 0; /* index of Node we are 
                          currently looking at */
        while (current != null) 
        { 
            if (count == index) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
  
        /* if we get to this line, the caller was asking 
        for a non-existent element so we assert fail */
        //assert(false); 
        return null; 
    } 
}
