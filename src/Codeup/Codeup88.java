package Codeup;

import java.io.*;

public class Codeup88 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1부터 입력값까지 1씩 증가시키고 3의 배수는 경우는 출력 X

        int a = Integer.parseInt(br.readLine());

        for (int i=1; i<=a; i++) {
            if (i%3==0) {
                bw.write("");
            } else {
                bw.write(i+" ");
            }
        }
        br.close();
        bw.close();
    }
}
