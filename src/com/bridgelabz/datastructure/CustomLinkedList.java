package com.bridgelabz.datastructure;

public class CustomLinkedList<T> {

	private MyNode<T> first;
	private MyNode<T> last;

	public boolean isEmpty(){
		return first==null;
	}
	public void add(T t) {

		MyNode<T> nd = new MyNode<T>();
		nd.setValue(t);
		if (first == null) {
			first = nd;
			last = nd;
		} else {
			last.setNextRef(nd);
			last = nd;
		}
	}

	public int print() {

		MyNode<T> tmp = first;
		int i = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				System.out.println(tmp.getValue());
				i++;
			}
			tmp = tmp.getNextRef();
		}
		return i;
	}
	public void clear() {

		MyNode<T> tmp = first;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				tmp.setValue(null);
			}
			tmp = tmp.getNextRef();
		}
	}
	public void printNew() {

		MyNode<T> tmp = first;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				System.out.print(tmp.getValue()+" ");
			}
			tmp = tmp.getNextRef();
		}
	}
	public CustomLinkedList<Integer> getValue() {

		MyNode<T> tmp = first;
		CustomLinkedList<Integer> MyNode=new CustomLinkedList<Integer>();
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				MyNode.add((Integer) tmp.getValue());
			}
			tmp = tmp.getNextRef();
		}
		return MyNode;
	}
	public int size() {

		MyNode<T> tmp = first;
		int i = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				i++;
			}
			tmp = tmp.getNextRef();
		}
		return i;
	}

	public boolean printValue(int length, String key, CustomLinkedList<String> li) {
		MyNode<T> nd2 = first;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if (key.compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) {
				//					int index=li.index(key);
				//					li.remove(index);
				nd2.setValue(null);
				return true;
			} 
			nd2 = nd2.getNextRef();
		}
		li.add(key);
		li.print();
		return false;
	}
	public int index(T data){
		MyNode<T> curr=first;
		int count=0;
		while(curr!=null){
			if((String.valueOf(curr.getValue())).compareToIgnoreCase(String.valueOf(data))==0){
				curr.getNextRef();
				return count;
			}
			count++;
			curr=curr.getNextRef();
		}
		assert(false);
		return 0;
	}

	public void remove(int index){
		if(isEmpty())
			return;
		MyNode<T> temp=first;
		if(index==0){
			first=temp.getNextRef();
			return;
		}
		for(int i=0;temp!=null && i<index-1;i++){
			temp=temp.getNextRef();
		}
		if (temp == null || temp.getNextRef() == null) 
			return; 
		@SuppressWarnings("unused")
		MyNode<T> next = temp.getNextRef().getNextRef(); 

		next=temp.getNextRef();
	}
	public int [] convInteger(CustomLinkedList<Integer> li,int len)
	{
		MyNode<Integer> nd2 = li.first;
		int [] arr=new int[len];
		int i=0;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if(nd2.getValue()!=null)
			{
				arr[i++]=(int) nd2.getValue();
				//					i++;
			}
			nd2 = nd2.getNextRef();
		}
		return arr;
	}

	public int[] sortArray(int [] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j]>key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public boolean findIntegerValue(int length, int key, CustomLinkedList<Integer> li2) {
		MyNode<T> nd2 = first;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if (String.valueOf(key).compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) 
			{
				nd2.setValue(null);
				return true;
			} 
			nd2 = nd2.getNextRef();
		}
		li2.add(key);
		length=li2.size();
		int [] arr=li2.convInteger(li2,length);
		int [] arr2=li2.sortArray(arr);
		System.out.println("after sorting:");
		li2.clear();
		for(int i:arr2)
		{
			li2.add(i);
		}
		return false;

	}
	public boolean search(T key){
		MyNode<T> temp=first;
		while(temp.getNextRef()!=null){
			if( String.valueOf(key).compareToIgnoreCase(String.valueOf(temp.getValue())) == 0){
				return true;
			}
			temp=temp.getNextRef();
		}
		return false;
	}

	public String [] convString(CustomLinkedList<T> li,int len)
	{
		MyNode<T> nd2 = li.first;
		String [] str=new String[len];
		int i=0;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if(nd2.getValue()!=null)
			{
				str[i++]=(String) nd2.getValue();
				//					i++;
			}
			nd2 = nd2.getNextRef();
		}
		return str;
	}
	public int [] convertInt(CustomLinkedList<Integer> li,int len)
	{
		MyNode<Integer> nd2 = li.first;
		int [] str=new int[len];
		int i=0;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if(nd2.getValue()!=null)
			{
				str[i++]=(Integer) nd2.getValue();
				//					i++;
			}
			nd2 = nd2.getNextRef();
		}
		return str;
	}}