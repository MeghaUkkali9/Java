import java.util.Scanner;
public class ReverseString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String input = scanner.next();
        System.out.println(input.matches("\\s"));
        System.out.println("The reverse order of name "+input+" is");
        for(int i = (input.length() -1); i>=0; i--){
            System.out.print(input.charAt(i));
        }


    }
}
