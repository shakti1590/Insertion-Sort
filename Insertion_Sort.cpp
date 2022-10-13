#include <iostream>

using namespace std;

// Function for insertion sort
void insertion_Sort(int arr[], int n)
{
    int tmp, j;

    for(int i = 1; i < n; i++)
    {
        tmp = arr[i];
        j = i - 1;

        // Do swapping
        while(j >= 0 && arr[j] > tmp)
        {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = tmp;
    }
}

// Function to print elements of array
void print(int arr[], int n)
{
    for(int i = 0;i<n;i++)
        cout << arr[i] << " ";

    cout << endl;
}

// Driver Function
int main()
{
    int arr[] = {2, 4, 3, 1, 6, 8, 4};
    insertion_Sort(arr, 7);
    print(arr, 7);
    return 0;
}

// Output
// 1 2 3 4 4 6 8
