package src.datastructure.sort;

public class SelectionSort {

    static String testA = "2143";

    public static void main(String[] args) {
        selectionSort(testA);
    }

    public static int selectionSort(String a) {
        // 새 배열을 만들고 크기를 파라미터로 넘어온 String의 길이만큼 생성
        int A[] = new int[a.length()];

        // String의 1글자씩 나눠서 배열에 저장
        for (int i=0; i<a.length(); i++) {
            A[i] = Integer.parseInt(a.substring(i, i+1));
        }

        for (int i=0; i<a.length(); i++) {
            int max = i;
            for (int j=i+1; j<a.length(); j++) {
                // 현재 범위에서 Max값 찾기
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            // 현재 i의 값과 Max의 값중 Max값이 더 크면 Swap 수행
            if (A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }

        // 출력
        int result = 0;
        for (int i=0; i<a.length(); i++) {
            result = A[i];
            System.out.println(result);
        }
        return result;
    }
}
