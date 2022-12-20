package Class1;

/* 음계 */

import java.io.*;
import java.util.StringTokenizer;

public class Baek_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /* 배열 선언 후 Tokenizer로 문자열 분리 */
        int[] num = new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* 입력값을 배열에 순서대로 넣음 */
        for (int i=0; i<8; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i=0; i<7; i++) {
            /*
            ascending = 1 2 3 4 5 6 7 8
            다음요소가 전 요소보다 작으면 ascending 실패
            num[1] < num[0] = 2 < 1
            num[2] < num[1] = 3 < 2
            ascending = false;
             */
            if (num[i+1] < num[i]) {
                ascending = false;
            }
            /*
            descending = 8 7 6 5 4 3 2 1
            다음요소가 전 요소보다 크면 descending 실패
            num[1] > num[0] = 7 > 8
            num[2] > num[1] = 6 > 7
            descending = false;
             */
            if (num[i+1] > num[i]) {
                descending = false;
            }
        }

        if (ascending) {
            bw.write("ascending");
        } else if (descending) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

