public class Searching {
    public static void main(String[] args) {
        System.out.println("Searching");
    }
}

/*
LINEAR SEARCH

public class LinearSearch {
    LINEAR SEARCH FUNCTION
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return the index if the element is found
            }
        }
        return -1;  // Return -1 if the element is not found
    }

    MAIN Function
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
*/


/*
BINARY SEARCH

public class BinarySearch {
    BINARY SEARCH FUNCTION
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;  // Return the index if the element is found
            } else if (arr[mid] < target) {
                low = mid + 1;  // Search in the right half
            } else {
                high = mid - 1;  // Search in the left half
            }
        }
        return -1;  // Return -1 if the element is not found
    }

    MAIN FUNCTION
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
*/