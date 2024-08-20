public class LinearSearch {
    public static int linearFunc(int []arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 30 ,40, 50, 60};
        int target = 50;
        int index = linearFunc(arr, target);
        if (index != -1){
            System.out.println("The element is " + index);
        }else {
            System.out.println("Element not found");
        }

    }
}
