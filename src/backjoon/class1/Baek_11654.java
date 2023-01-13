package src.backjoon.class1;

import java.io.*;

public class Baek_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String aa = br.readLine();
        int a = aa.charAt(0);
        bw.write(String.valueOf(a));
        br.close();
        bw.flush();
        bw.close();
    }
}
