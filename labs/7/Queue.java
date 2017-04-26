/**
   * file: Queue.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 7, 10.10
   * date completed: 4/25/2017

   * 
   * This file represents the queue
   *
   */
public class Queue {
	//create data field
	private int[] elements;
	private int size;
	//set initial array size to 8
	public static final int BASE_SIZE = 8;
	Queue(){
		elements = new int[BASE_SIZE];
		
	}
	
	public void enqueue(int v){
		if (size >= elements.length){
			int[] temp = new int[(elements.length) * 2];
			System.arraycopy(elements, 0, temp, 0 , elements.length);
			elements=temp;
		}
		
		elements[size++] = v;
		
	}
	//it removes elements if we want to
	public int dequeue(){
		int v = elements[0];
		int[] temp = new int[elements.length];
		System.arraycopy(elements, 1, temp ,0, size);
		elements=temp;
		size--;
		return v;
		
	}
	//will return true if the queue is empty
	
	public boolean empty(){
		return size == 0;
		
	}
	//gets the size
	public int getSize(){
		return size;
	}

}
