// Java program for implementation of Insertion Sort
//Insert an element from unsorted array to its correct position in a sorted array

class InsertionSort {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			
			arr[j + 1] = key;
		}
	}

	
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[])
	{
		int arr[] = { 14, 15, 17, 9, 4 };

		InsertionSort obj = new InsertionSort();
		obj.sort(arr);

		printArray(arr);
	}
} 

