package src.codeup;

import java.io.*;

public class Codeup65 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);

        if (a % 2 == 0) {
            bw.write(String.valueOf(a));
            bw.write("\n");
        }
        if (b % 2 == 0) {
            bw.write(String.valueOf(b));
            bw.write("\n");
        }
        if (c % 2 == 0) {
            bw.write(String.valueOf(c));
            bw.write("\n");
        }
        br.close();
        bw.close();
    }
}
