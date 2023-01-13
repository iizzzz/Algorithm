package src.backjoon.class1;

import java.io.*;

public class Baek_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i=1; i<=9; i++) {
            bw.write(a + " * " + i + " = " + (a*i) + "\n");
            // 2(a) * 1 = (2(a)*1) + 줄바꿈
        }
        bw.close();
        br.close();
    }
}