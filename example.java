//example of linear search in java
public class example {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 6;
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
