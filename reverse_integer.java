import java.util.*;
public class reverse_integer {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.err.println("Enter the Integer");
        int n=obj.nextInt();
        int reverse=0;
        while(n>0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
