package Codeup;

import java.io.*;

public class Codeup91 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        long a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);
        int d = Integer.parseInt(num[3]);

        for (int i=1; i<d; i++) {
            a = a*b+c;
        }

        bw.write(String.valueOf(a));
        br.close();
        bw.flush();
        bw.close();
    }
}
