/**
   * file: queueTester.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 7, 10.10
   * date completed: 4/25/2017

   * 
   * This file is the test for the queue class
   *
   */
public class queueTester {
	public static void main(String[] args){
		//making the queue
		Queue queue = new Queue();
		//loop for 20
		for (int i = 1; i <= 20; i++){
			queue.enqueue(i);
		}
		//prints until the queue is empty... as well as remove and display
		while (!queue.empty()){
			System.out.println(queue.dequeue() + ",");
		}
		
	}

}
