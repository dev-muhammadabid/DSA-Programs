public class Sorting {
    public static void main(String[] args) {
        System.out.println("Sorting");
    }
}



/*
Basic function of printing the array.
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
          printArray(arr); // Calling Function
*/

//Example - int arr[] = {7, 8, 3, 1, 2};

/*
BUBBLE SORT PROGRAM
Time Complexity = 0(n^2)


 for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
*/


/*
SELECTION SORT PROGRAM
Time Complexity = 0(n^2)

for (int i = 0; i < arr.length - 1; i++){
            int smallest = i;
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[smallest] > arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
*/


/*
INSERTION SORT PROGRAM
Time Complexity = 0(n^2)

for (int i = 0; i < arr.length; i++){
           int current = arr[i];
           int j = i - 1;
           while (j >= 0 && current < arr[j]){
               arr[j + 1] = arr[j];
               j--;
            }

           //Placement
            arr [j + 1] = current;
        }
        printArray(arr);
*/


/*
MERGE SORT
Time Complexity = nlogn

public class Sorting {
    public static void conquer(int arr[], int startidx, int mid, int endidx) {
        int merged[] = new int[endidx - startidx + 1];

        int idx1 = startidx;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endidx) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= endidx) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = startidx; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int startidx, int endidx) {
        if (startidx >= endidx) {
            return;
        }

        int mid = startidx + (endidx - startidx) / 2;
        divide(arr, startidx, mid);
        divide(arr, mid + 1, endidx);
        conquer(arr, startidx, mid, endidx);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

*/