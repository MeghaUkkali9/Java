import java.util.Scanner;

public class NameAdd {

    public static void main(String args[]){
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String input = scanner.next();
        int sum = 0;
        System.out.println("The name:" + input);
        for(int i = 0; i < input.length(); i++){
            System.out.println(input.charAt(i));
            char c = (char)input.charAt(i);
            for (int j = 0; j < letters.length; j++){
                char pq = letters[j];
                char ch = Character.toLowerCase(pq);
                if(c == ch){
                    sum = sum + (j+1);
                }
            }
        }
        System.out.println(sum + ": sum");
    }
}
