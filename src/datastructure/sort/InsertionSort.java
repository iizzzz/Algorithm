package src.datastructure.sort;

public class InsertionSort {

    static int testA = 5;
    static int[] testB = {3, 1, 4, 3, 2};

    public static void main(String[] args) {
        insertionSort(testA, testB);
    }

    public static int insertionSort(int a, int[] b) {
        // 자릿수별로 구분해 저장한 배열
        int[] A = new int[a];
        // A의 합 배열, 각 사람이 인출을 완료하는데 필요한 시간을 저장할 배열
        int[] B = new int[a];

        for (int i=0; i<a; i++) {
            A[i] = b[i];
        }

        for (int i=1; i<a; i++) {
            int point = i;
            int value = A[i];

            for (int j=i-1; j>=0; j--) {
                if (A[j] <A[i]) {
                    point = j+1;
                    break;
                }
                if (j == 0) point = 0;
            }

            for (int j=i; j>point; j--) {
                A[j] = A[j-1];
            }
            A[point] = value;
        }

        // 합 배열
        B[0] = A[0];
        for (int i=1; i<a; i++) {
            B[i] = B[i-1] + A[i];
        }

        int sum = 0;
        for (int i=0; i<a; i++) {
            sum += B[i];
        }

        System.out.println(sum);
        return sum;
    }
}
