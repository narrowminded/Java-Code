package com.company;
//
//public class Binary_Search {
//    static void BinarySearch(int []Arr, int end, int data){
//        int start = 0;
//        int high = end;
//
//        int pivot = 0;
//
//        //Applying Binary Search Algorithm
//        while(start <= end) {
//            int mid  = (high+start)/2;
//            //if the data is found
//            if (data == Arr[mid]) {
//                pivot = 1;
//                System.out.println(data + "is present in the Array");
//            }
//            //If Arr[mid] is greater than data then end goes to mid-1
//            if (Arr[mid] > data) {
//                end = mid - 1;
//            }
//            //If Arr[mid] is smaller than data then start goes to mid+1
//            else {
//                start = mid + 1;
//            }
//        }
//        if(pivot == 0){
//            System.out.println("The Element is Not Found");
//        }
//    }
//
//    public static void main(String[] args) {
//        int []Arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        int size = 20;
//        BinarySearch(Arr, Arr.length, 7);
//    }
//}


// Java implementation of iterative Binary Search

class BinarySearch {
    int binarySearch(int a[], int l, int r, int x)
    {
        while (l <= r) {
            int m = (l + r) / 2;

            // Index of Element Returned
            if (a[m] == x) {
                return m;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                // so we decrease our r pointer to mid - 1
            } else if (a[m] > x) {
                r = m - 1;

                // Else the element can only be present
                // in right subarray
                // so we increase our l pointer to mid + 1
            } else {
                l = m + 1;
            }
        }

        // No Element Found
        return -1;
    }

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();

        int a[] = { 2, 3, 4, 10, 40 };
        int n = a.length;
        int x = 10;

        int res = ob.binarySearch(a, 0, n - 1, x);

        if (res == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + res);
    }
}
