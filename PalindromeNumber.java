import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value");
        int n=obj.nextInt();
        int rem=0;
        int sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;

        }
        if(temp==sum){
            System.out.println(sum);
            System.out.println("Palindrone");
        }
        else{
            System.out.println("Not Palindrone");
        }
    }
}
