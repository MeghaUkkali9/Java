import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class ReverseInteger {
    public static void main(String args[]) {
        int input = 321, temp;
        String stringInput = "Gadag";
        temp = input;
        int num,num1=0;
        while (temp > 0) {
            num =temp % 10;
            num1 = (num1 *10)+num;
            temp = temp /10;
        }
        System.out.println(num1);

        if(input == num1){
            System.out.println("The given number is Palindrome.");
        }else{
            System.out.println("The given number is not Palindrome.");
        }

        stringInput=stringInput.toLowerCase();
        int i=0, j=stringInput.length()-1;
        boolean flag=false;
        while(i<j){
            if(stringInput.charAt(i) != stringInput.charAt(j))
            {
                flag=true;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("Not palindrome");
        }else{
            System.out.println("Palindrone");
        }

    }
}
