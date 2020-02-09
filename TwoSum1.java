import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String args[]) {
        Map<Integer, Integer> hashMap = new LinkedHashMap();
        int array[] = {2, 7, 11, 15};
        int target = 9;

        System.out.println("The given array:");
        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println("The given target: " + target);

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], i);
        }
        int a[] = getIndices(array, hashMap, target);

        System.out.print("{");
        for (int arr : a) {
            System.out.print(arr + ",");
        }
        System.out.println("}");

    }

    private static int[] getIndices(int[] array, Map<Integer, Integer> hashMap, int target) {
        int a[] = new int[2];
        int compare;

        for (int i = 0; i < array.length; i++) {
            compare = target - array[i];
            if (hashMap.containsKey(compare)) {
                a[i] = i;
                a[i + 1] = hashMap.get(compare);
                return a;
            }
        }
        return a;
    }
}
