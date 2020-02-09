import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.*;
import java.util.LinkedHashMap;

public class MedianTwoArrays<character> {


    static Map<Character, Integer> hashMap = new LinkedHashMap<>();

    public static void main(String args[]) {

        int num1[] = {6, 2, 2, 1, 1};
        int num2[] = {1, 8, 9, 2, 1};

        int a = -2;
        int b = 1;
        a = a ^ b;

        System.out.println("Sum:" + a);

        String input = "MEGHA";
        System.out.println("Input String: " + input);
        System.out.println(removeDuplicates(input));
        System.out.println(getMedianFromArray(num1, num2));
    }

    static String removeDuplicates(String input) {
        int occurrence = 0;
        for (int i = 0; i < input.length(); i++) {
            char leter = input.charAt(i);


            if (hashMap.containsKey(leter)) {
                hashMap.remove(leter);
            } else {
                occurrence++;
                hashMap.put(leter, occurrence);
            }
        }
        Set<Character> keySet = hashMap.keySet();
        System.out.print("Output: ");
        for (Character key : keySet) {
            System.out.print((key));
        }
        System.out.println();
        return null;

    }

    static String getMedianFromArray(int num1[], int num2[]) {

        int N = num1.length + num2.length;

        int A[] = new int[N];

        for (int i = 0; i < num1.length; i++) {
            A[i] = num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            A[i + num1.length] = num2[i];
        }

        int num;
        float median;
        num = N / 2;
        if (N % 2 == 0) {
            int first = A[num - 1];
            int second = A[num];
            median = (first + second) / 2;
            System.out.println("Median of aray: " + median);
            return "Number not found in array";
        } else {
            median = A[num];
            System.out.println();
            System.out.println("Median of aray: " + median);
        }
        for (int i = 0; i < N; i++) {
            if (i == num) {
                if (num < num1.length) {
                    return "Number present in first array and present at the index" + i;
                } else {
                    return "Number present in second array and present at the index" + (i - num1.length);
                }
            }
        }
//
//        for (int i = 0; i < num1.length; i++) {
//            if (i == num) {
//                if (median == num1[i]) {
//
//                    return "Number present in first array and present at the index" + i;
//                }
//            }
//        }
//        for (int i = 0; i < num2.length; i++) {
//            if (i == num) {
//                if (median == num2[i]) {
//                    return "Number present in second array and present at the index" + i;
//                }
//            }
//        }
        return "not found in both array";
    }
}
