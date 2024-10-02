import java.util.Scanner;
public class sumOfFactorial {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value");
        int n=obj.nextInt();
        int fact=0;
        for(int i=1;i<=n;i++){
            fact=fact+i;
        }
        System.out.println(fact);
    }
}
