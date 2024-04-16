//search in rotated array



#include <bits/stdc++.h>
#include<iostream>


using namespace std;
 
int search(int arr[], int low, int high, int key)
{
 
    while (low <= high) {
        int mid = low + (high - low) / 2;
 
        if (arr[mid] == key) {
          
            return mid;
        }
 
        // checking the sorted part of the array
        
        if (arr[low] <= arr[mid]) {
         
 
            if (key >= arr[low] && key < arr[mid])
                high = mid - 1;
 
            else
                
                low = mid + 1;
        }
 
        else {
         
            if (key <= arr[high] && key > arr[mid])
                low = mid + 1;
 
            else
                // Means our target is in left half
                high = mid - 1;
        }
    }
 
    
 
    return -1;
}

int main()
{
    int arr[] = {4,5,6,7,0,1,2};
    int n = sizeof(arr) / sizeof(arr[0]);
 
    int key = 2;
    cout << search(arr, 0, n - 1, key) << endl;
 
    return 0;
}

