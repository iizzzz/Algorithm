package src.backjoon.class1;

/* 상수 */

import java.io.*;
import java.util.StringTokenizer;

public class Baek_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문자열을 공백으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 입력값을 reverse로 반전 후 String 변환 -> Integer.parseInt로 다시 변환
        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        // 최대값을 삼항연산자를 이용해 변수에 담아서 출력
        int max = a>b?a:b;
        bw.write(String.valueOf(max));
        br.close();
        bw.flush();
        bw.close();
    }
}
