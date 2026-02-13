public class LinearSearch {  // declare the class named LinearSearch
    public static void main(String[] args) { // main method — program entry point
        int[] arr = { 2, 3, 4, 10, 15, 6 }; // sample integer array to search
        int i = linearSearch(arr, 10); // call linearSearch to find the value 10 and store returned index in i
        System.out.println("linearsearch(arr, 10) returns " + i); // print the result for search of 10
        int j = linearSearch(arr, 7); // call linearSearch to find the value 7 and store returned index in j
        System.out.println("linearsearch(arr, 7) returns " + j); // print the result for search of 7
        // end of the demonstration in main
    }  // end of main method 
  
    public static int linearSearch(int[] arr, int key) { // linear search method: returns index of key or -1
        for (int i = 0; i < arr.length; i++) { // loop through each index from 0 to arr.length-1
            if (arr[i] == key) { // compare the current element with the search key
                return i; // if equal, return the current index immediately
            } // end of if
        } // end of for loop (key not found in any element)
        return -1; // return -1 to indicate the key was not found
    } // end of linearSearch method

} // end of class LinearSearch
