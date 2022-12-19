package Codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup93 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] num = new int[23];

            // tokenizer에 남은 토큰이 있을 시
            while (st.hasMoreTokens()) {
                // temp = st의 다음 요소 입력
                int temp = Integer.parseInt(st.nextToken());
                // num[st의 요소 -1]++
                num[temp-1]++;
            }

            // num.length 에 남긴 요소를 공백으로 구분하여 출력
            for (int i : num) {
                bw.write(i+" ");
            }
            br.close();
            bw.flush();
            bw.close();

        } catch (Exception e) {
        }
    }
}
