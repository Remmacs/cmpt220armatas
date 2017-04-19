/**
   * file: pivotPartition.java
   * author: Alexander Armatas
   * course: CMPT 220
   * assignment: Lab 5, 7.32
   * date completed: 4/6/2017

   * 
   * the program partitions by using the pivot
   *
   */
import java.util.Scanner;
public class pivotPartition {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list:");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) list[i] = input.nextInt();

        System.out.print("New List post partition ");
        for (int i = 0; i < list.length; i++)
          System.out.print(list[i] + " ");


    }

    public static int partition(int[] list) {

        int first = 0;
        int low = first + 1;
        int high = list.length - 1;
        int pivot = list[first];

        while (high > low) {
        	//search forward from left & back from right

            while (low <= high && list[low] <= pivot) low++;
            while (low <= high && list[high] > pivot) high--;
            //swap the two elements 
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high >= low && list[high] >= pivot) high--;
        //swap pivot with list
        if (high > first) {
            int temp = list[high];
            list[high] = list[first];
            list[first] = temp;
            return high;
        } else {
            return first;
        }
    }
}