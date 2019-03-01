package com.bridgelabz.datastructure;

import java.util.*;

public class CustomDequeue {
	public ArrayList<String> deque = new ArrayList<String>();
    
    public void insertFront(String item){
        //add element at the beginning of the queue
        deque.add(0,item);
        System.out.println(deque);
    }
     
    public void insertRear(String item){
        //add element at the end of the queue
        deque.add(item);
        System.out.println(deque);
    }
     
    public void removeFront(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        deque.remove(0);
    }
     
    public void removeRear(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        deque.remove(deque.size()-1);
    }
     
    public String peakFront(){
        //gets the element from the front without removing it
    	String item = deque.get(0);
        return item;
    }
     
    public String peakRear(){
        //gets the element from the rear without removing it
    	String item = deque.get(deque.size()-1);
        return item;
    }
    
    public void display() {
    	System.out.println("Dequeue is "+deque);
    }
}
