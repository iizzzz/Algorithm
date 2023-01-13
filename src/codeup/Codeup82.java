package src.codeup;

import java.io.*;

public class Codeup82 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine(), 16);

        for (int i=1; i<16; i++) {
            bw.write(String.format("%X*%X=%X\n", a, i, a*i));
        }
        br.close();
        bw.close();
    }
}
