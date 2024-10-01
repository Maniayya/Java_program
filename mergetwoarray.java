import java.util.*;
public class mergetwoarray {
    public static void main(String[] args) {
        int a[]={5,4,3,2,4,4,54};
        int b[]={4,3,2,4,2,42,44};
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
       
        System.out.println( Arrays.toString(c));
    }
}
