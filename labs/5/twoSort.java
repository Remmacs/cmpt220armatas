/**
   * file: twoSort.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 5, 7.31
   * date completed: 4/5/2017

   * 
   * This file swaps the largest number and swaps it with the last
   *
   */
import java.util.Scanner;

public class twoSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Decide how long, then create first list: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.print("Decide how long, then create second list: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		//merge list create combined list

		int[] combinedList = merge(list1, list2);

		System.out.println("The merged list is");
		for(int i = 0; i < combinedList.length; i++){
			System.out.print(combinedList[i] + " ");
		}
	}
	//create the merge that will combine them

	public static int[] merge(int[] list1, int[] list2)  {
		int[] combinedList = new int[list1.length + list2.length];
		
		for (int i = 0; i < list1.length; i++)
			combinedList[i] = list1[i];

		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			combinedList[j] = list2[i];	
		}

		sort(combinedList);

		return combinedList;
	}
// sorting for low to high
	public static void sort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int minIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					minIndex = j; 
				}					
			}
			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
	}
}