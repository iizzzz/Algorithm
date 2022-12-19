package Codeup;

import java.io.*;

public class Codeup78 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=0; i<=a; i++) {
            if (i % 2 == 0) {  // i 가 짝수면 짝수인 i를 계속 더함
                sum = sum+i;
            }
        }
        bw.write(String.valueOf(sum));
        br.close();
        bw.close();
    }
}
