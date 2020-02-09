import java.lang.reflect.Array;

public class Arrays {
    public static void main(String args[]){
        //Array is not resizable

            //primitive array
            int[] ints = {3, 2, 1, 0};
            for (int i = 3; i >= 0; i--) {
                System.out.println(ints[i]);
            }
            //array pf strings

            String string[] = {"megha", "gaurav"};
            java.util.Arrays.sort(string);

            for (int i = 0; i < string.length; i++) {
                System.out.println(string[i]);
            }

            //sized array

            int[] sizedArray = new int[5];
            for (int i=0; i<sizedArray.length;i++){
                sizedArray[i]= i+1;
            }
            for (int sized: sizedArray) {
                System.out.println(sized);
            }
                System.out.println("==================");
            int[] copyArray = new int[4];
            System.arraycopy(sizedArray,0,copyArray,2,2);
            for (int copyS: copyArray) {
                System.out.println(copyS);
            }
    }
}
