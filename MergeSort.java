import java.util.Random;

public class MergeSort {
    public static void main(String args[]) {
        int N = 5;
        int a[]={0,4,3,2,1};
//        int a[] = new int[N];
//        for (int i = 0; i < a.length; i++) {
//            Random random = new Random();
//            a[i] = random.nextInt(100);
       // }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        mergeSortCall(a, 0, a.length - 1);
        System.out.println("After merge sort....");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void mergeSortCall(int[] A, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            System.out.println("L:"+l+"M:"+m+"R:"+r);
            mergeSortCall(A, l, m);
            System.out.println("First merge recursive over");
            System.out.println("M:"+m+"R:"+r);
            mergeSortCall(A, m + 1, r);

            merge(A, l, m, r);
        }
    }

    private static void merge(int[] A, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = A[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                A[k] = L[i];
                i++;
            }
            else
            {
                A[k] = R[j];
                j++;
            }
            k++;

        }
        while (i < n1)
        {
            A[k] = L[i];
            i++;
            k++;
        }

    /* Copy the remaining elements of R[], if there
       are any */
        while (j < n2)
        {
            A[k] = R[j];
            j++;
            k++;
        }

    }
}
