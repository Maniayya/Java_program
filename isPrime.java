import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=obj.nextInt();
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0 && n%1==0){
              c++;  
            }
        }
        if(c==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
