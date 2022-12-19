package Codeup;

import java.io.*;

public class Codeup90 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        long a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);

        for (int i=1; i<c; i++) {
            a = a*b; // 2*3=6 , 6*3=18, 18*3=54
        }

        bw.write(String.valueOf(a));
        br.close();
        bw.flush();
        bw.close();
    }
}
