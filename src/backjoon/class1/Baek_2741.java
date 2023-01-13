package src.backjoon.class1;

import java.io.*;

public class Baek_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i=1; i<=a; i++) {
            bw.write(i+"\n");
        }
        br.close();
        bw.close();
    }
}
