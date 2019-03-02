package com.bridgelabz.datastructure;
public class MyNode<T> {
	    private T value;
	    private MyNode<T> nextRef;
	    /**
	     * Constructors to initialize the instance variables
	     */
	    public MyNode(){
	        value=null;
	        nextRef=null;
	    }
	    /**
	     * Parameterized Constructors to initialize instance and
	     * local variables
	     *
	     * @param data the data to store in the MyNode of a linked list
	     * @param next the address of the next MyNode
	     */
	    public MyNode(T data, MyNode<T> next){
	        this.value=data;
	        this.nextRef=next;
	    }
	    /**
	     * Getter method to get the data
	     *
	     * @return
	     */
	    public T getValue() {

	        return value;
	    }
	    /**
	     * Setter method to set the data
	     *
	     * @param data the data to be set
	     */

	    public void setValue(T value) {
	        this.value = value;
	    }
	    /**
	     * Getter Method to get the address of the previous MyNode
	     *
	     * @return the address of the previous MyNode
	     */
	    public MyNode<T> getNextRef() {
	        return nextRef;
	    }
	    /**
	     * Setter Method to get the address of the previous MyNode
	     *
	     * @return the address of the previous MyNode
	     */
	    public void setNextRef(MyNode<T> ref) {
	        this.nextRef = ref;
	    }
}

