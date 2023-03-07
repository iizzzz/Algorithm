package src.datastructure.sort;

public class BubbleSort {

    static int testA = 5;
    static int[] testB = {5, 2, 3, 4, 1};

    public static void main(String[] args) {
        bubbleSort(testA, testB);
    }

    public static int bubbleSort(int a, int[] b) {
        // 정렬할 배열 생성
        int[] A = new int[a];

        // 정렬할 배열에 파라미터로 넘어온 정렬되지 않은 숫자를 담는다
        for (int i=0; i<a; i++) {
            A[i] = b[i];
        }

        for (int i=0; i<a-1; i++) {
            for (int j=0; j<a-1-i; j++) {
                if (A[j] > A[j+1]) {
                    // 현재 A 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수를 바꾼다.
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        // 값 출력
        int answer = 0;
        for (int i=0; i<a; i++) {
            answer = A[i];
            System.out.println(answer);
        }
        return answer;
    }
}
