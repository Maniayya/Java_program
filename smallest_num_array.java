import java.util.Scanner;
import java.util.Arrays;
public class smallest_num_array {
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
     System.out.println("Smallest num in Array :4 " + arr[0]);
}
}
