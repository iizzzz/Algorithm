package src.codeup;

import java.io.*;

public class Codeup85 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        long h = Integer.parseInt(num[0]);
        long b = Integer.parseInt(num[1]);
        long c = Integer.parseInt(num[2]);
        long s = Integer.parseInt(num[3]);

        double a = (h * b * c * s) / (double)1024 / 8 / 1024;

        bw.write(String.format("%.1f MB", (float)a));
        br.close();
        bw.close();
    }
}
