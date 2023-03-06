package src.programmers.고득점Kit.정렬;

import java.util.Arrays;

public class K번째수 {

    static int[] a = {1, 5, 2, 6, 3, 7, 4};
    static int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    public static void main(String[] args) {
        solution(a,b);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp;

        int i,j,k;
        for (int x=0; x<commands.length; x++) {
            // 2차원 배열 각 요소의 0,1,2 번째 인덱스를 i,j,k로 지정
            i = commands[x][0];
            j = commands[x][1];
            k = commands[x][2];

            // 자른 배열을 temp에 저장, 4,1,7 의 길이를 가진 배열 생성
            temp = new int[(j-i) + 1];
            int z = i;

            for (int y=0; y<temp.length; y++) {
                // temp[0] = array[2-1] 5
                // temp[1] = array[3-1] 2
                // temp[2] = array[4-1] 6
                // temp[3] = array[5-1] 3
                temp[y] = array[z-1];
                z++;
                System.out.println(Arrays.toString(temp));
            }

            // 위에서 나온 배열을 정렬 [2,3,5,6]
            Arrays.sort(temp);
            // k의 수를 정답에 저장
            // answer[0] = temp[3-1] = 5
            answer[x] = temp[k-1];
        }

        return answer;
    }
}
