import java.util.Scanner;
public class ReverseaString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Value: "); // Added a colon and space for better formatting
        String str = obj.nextLine();
        String temp = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }

        // Compare using .equals() to check if the string is a palindrome
        if (temp.equals(str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // The final print statement
        System.out.println("Try programiz.pro");
    }
}
