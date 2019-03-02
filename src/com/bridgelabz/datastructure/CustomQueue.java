package com.bridgelabz.datastructure;

public class CustomQueue{
	    int Queue[] ;
	    String que[];
	    int front, rear, size, len;
	 
	    /* Constructor */
	    public CustomQueue(int n) 
	    {
	        size = n;
	        len = 0;
	        Queue = new int[size];
	        front = -1;
	        rear = -1;
	    }    
	    /*  Function to check if queue is empty */
	    public boolean isEmpty() 
	    {
	        return front == -1;
	    }    
	    /*  Function to check if queue is full */
	    public boolean isFull() 
	    {
	        return front==0 && rear == size -1 ;
	    }    
	    /*  Function to get the size of the queue */
	    public int getSize()
	    {
	        return len ;
	    }    
	    /*  Function to check the front element of the queue */
	    public int peek() 
	    {
	        if (isEmpty())
	           System.out.println("Queue is empty");
	        return Queue[front];
	    }    
	    /*  Function to insert int element to the queue */
	    public void insert(int i) 
	    {
	        if (rear == -1) 
	        {
	            front = 0;
	            rear = 0;
	            Queue[rear] = i;
	        }
	        else if (rear + 1 >= size)
	        	 System.out.println("Queue is full ! overflow");
	        else if ( rear + 1 < size)
	            Queue[++rear] = i;    
	        len++ ; 
	    }    
	    /*  Function to remove front element from the queue */
	    public int remove() 
	    {
	        if (isEmpty()) {
	        	System.out.println("Queue is empty");
	        	return 0;
	        }	
	        else 
	        {
	            len-- ;
	            int ele = Queue[front];
	            if ( front == rear) 
	            {
	                front = -1;
	                rear = -1;
	            }
	            else
	                front++;                
	            return ele;
	        }        
	    }
	    /*  Function to display the status of the queue */
	    public void display()
	    {
	        System.out.print("Queue = ");
	        if (len == 0)
	        {
	            System.out.println("Empty Queue \n");
	            return ;
	        }
	        for (int i = front; i <= rear; i++)
	            System.out.print(Queue[i]+" ");
	        System.out.println();        
	    } 

} 