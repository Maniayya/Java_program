import java.util.Scanner;;
public class reverse_String {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=obj.nextLine();
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp=temp+str.charAt(i);
        }
        System.out.println(temp);
        
    }
}
