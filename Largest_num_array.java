import java.util.Arrays;
import java.util.Scanner;

public class Largest_num_array {
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
     System.out.println("Enter the Array Size");
     int n=obj.nextInt();
     System.out.println("Enter the Array Elements");
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=obj.nextInt();
     }
     Arrays.sort(arr);
     System.out.println("Largest num in Array : " + arr[arr.length-1]);
    }
}
