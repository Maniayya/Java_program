import java.util.*;
public class uniqueinarray {
    public static void printvalue(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            Arrays.sort(arr);
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 32, 32, 32, 44, 32, 44, 44};
        int n = arr.length; 
        printvalue(arr, n);  
    }
}
