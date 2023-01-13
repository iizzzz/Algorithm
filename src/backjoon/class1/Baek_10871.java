package src.backjoon.class1;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<a; i++) {
            int c = Integer.parseInt(st.nextToken());
            if (c < b) { // 입력값이 2번쨰숫자인 b 보다 작으면 sb에 추가
                sb.append(c).append(" ");
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}
