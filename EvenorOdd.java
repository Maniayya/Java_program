import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=obj.nextInt();
        if(n%2==0 || n==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
       
    }
}
