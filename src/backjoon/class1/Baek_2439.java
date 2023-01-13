package src.backjoon.class1;
/* 별 찍기 2 */

import java.io.*;

public class Baek_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i=1; i<=a; i++) {          /* 순회                             */
            for (int j=1; j<=a-i; j++) {    /* 공백은 n번째 행에 a-n개의 공백 출력  */
                sb.append(" ");             /* 즉, 1번째행 = 5-1인 4개의 공백 출력 */
            }
            for (int k=1; k<=i; k++) {      /* 별은 n번째 행에 n개 출력 = (i==행)  */
                sb.append("*");             /* 별의개수 = i(행)의 개수            */
            }
            sb.append("\n");                /* 줄바꿈                           */
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}