// Java program for implementation of Insertion Sort
//Insert an element from unsorted array to its correct position in a sorted array
import java.util.*;
class InsertionSort {
	//insertion sort function
	void sort(int arr[])
	{
		int n = arr.length; //len of array
		for (int i = 1; i < n; ++i) {
			int key = arr[i]; 
			int j = i - 1;
			//comapring with key to swap.
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j]; //for swapping
				j = j - 1;
			}
			
			arr[j + 1] = key;
		}
	}

	//method to print the array
	public static void printArray(int arr[],int p)
	{
		for (int i = 0; i < p; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[])
	{
		//taking input from user
		Scanner sc=new Scanner(System.in);  
		//Enter size of input array
		int p=sc.nextInt();
		//dynamic allocating the size to the array using new keyword.
		int[] arr = new int[p];  
		
		for(int i=0; i<p; i++)  
        	{  
            	arr[i]=sc.nextInt();  
        	}
		InsertionSort obj = new InsertionSort();
		obj.sort(arr);

		printArray(arr,p);
	}
} 
//Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
//This code is contributed by Shakti Singh.
