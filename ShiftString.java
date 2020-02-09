public class ShiftString {

    public static void main(String args[]) {

        ShiftString shiftString = new ShiftString();

        String input1 = "gaurav";
        String input2 = "uravgau";

        if (shiftString.findRotatedString(input1, input2)) {
            System.out.println("The given input1 is rotated. And matched with input2");
        } else {
            System.out.println("The given input1 is rotated. And not matched with input2");
        }
    }

    boolean findRotatedString(String input, String input2) {
        String s = "";
        boolean flag = false;
        char max = input.charAt(input.length() - 1);

        for (int i = 0; i < input.length(); i++) {
            s = max + input.substring(0, input.length() - 1);
            max = s.charAt(input.length() - 1);
            input = s;
            if (s.equalsIgnoreCase(input2)) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            return true;
        } else {
            return false;
        }
    }
}
