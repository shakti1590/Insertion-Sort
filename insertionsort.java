// Java program for implementation of Insertion Sort

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
			//placement
			arr[j + 1] = key;
		}
	}

	
	static void printArray(int arr[])
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

