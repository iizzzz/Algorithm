package src.datastructure.sort;

import java.util.StringTokenizer;

public class QuickSort {
    static String testA = "5 2";
    static int[] testB = {4,1,2,3,5};

    public static void main(String[] args) {
        function(testA, testB);
    }

    static int function(String a, int[] b) {
        StringTokenizer st = new StringTokenizer(a);
        // 파라미터로 들어온 문자열안에 담긴 숫자를 나눠서 저장
        // A = 숫자의 개수
        // B = K번째 수
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 숫자의 데이터를 저장할 새 배열
        int[] C = new int[A];


        for (int i=0; i<A; i++) {
            C[i] = b[i];
        }
        quickSort(C, 0, A-1, B-1);
        System.out.println(C[B-1]);

        return 1;
    }

    static void quickSort(int[] a, int b, int c, int k) {
        if (b < c) {
            int pivot = partition(a,b,c);
            if (pivot == k) {
                return;
            } else if (k < pivot) {
                quickSort(a,b,pivot-1,k);
            } else {
                quickSort(a,pivot+1,c,k);
            }
        }
    }

    static int partition(int[] a, int b, int c) {
        if (b+1 == c) {
            if (a[b] > a[c]) {
                swap(a, b, c);
            }
            return c;
        }
        int m = (b+c) / 2;
        swap(a,b,m);
        int pivot = a[b];
        int i = b+1;
        int j = c;

        while (i <= j) {
            while (pivot < a[j] && j > 0) {
                j--;
            }
            while (pivot > a[i] && i < a.length -1) {
                i++;
            }

            if (i <= j) {
                swap(a, i++, j++);
            }
        }
        a[b] = a[j];
        a[j] = pivot;
        return j;
    }

    static void swap(int[] a, int b, int c) {
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
