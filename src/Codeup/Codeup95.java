package Codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup95 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[a];
        int min = 24;

        for (int i=0; i<a; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, num[i]); // 두 변수를 비교해 minimum인 수를 min에 저장
        }
        bw.write(String.valueOf(min));
        br.close();
        bw.flush();
        bw.close();
    }
}
