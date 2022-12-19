package Codeup;

import java.io.*;

public class Codeup87 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        int n = 1;

        while (sum < a) {
            sum += n;
            n++;
        }

        bw.write(String.valueOf(sum));
        br.close();
        bw.close();
    }
}
