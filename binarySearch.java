public class binarySearch { // class that demonstrates a binary search implementation
    public static void main(String[] args) { // program entry point
        int[] arr = { 2, 3, 4, 10, 15, 9, 18 }; // input array to search (note: array should be sorted for binary
                                                // search)
        int i = search(arr, 10); // search for the value 10 and store the returned index (or negative insertion
                                 // encoding)
        System.out.println("search(arr, 10) returns " + i); // print the result for key 10
        int j = search(arr, 7); // search for the value 7 and store the returned index (or negative insertion
                                // encoding)
        System.out.println("search(arr, 7) returns " + j); // print the result for key 7
    } // end of main

    // the method for finding the key in the array
    public static int search(int[] arr, int key) { // binary search: returns index if found, otherwise returns
                                                   // -insertionPoint-1
        int low = 0; // lower bound index of the current search range
        int high = arr.length - 1; // upper bound index of the current search range
        while (low <= high) { // loop while there is a valid range to search
            int mid = low + (high - low) / 2; // compute middle index (avoids potential overflow)
            if (key < arr[mid]) { // if target is less than middle element
                high = mid - 1; // narrow search to lower half
            } else if (key == arr[mid]) { // if target equals middle element
                return mid; // found — return the index
            } else { // target is greater than middle element
                low = mid + 1; // narrow search to upper half
            }
        } // end while loop — range exhausted, target not found
        return -low - 1; // not found: return negative insertion-point encoding (compatible with
                         // Arrays.binarySearch)
    } // end of search method
} // end of class binarySearch
