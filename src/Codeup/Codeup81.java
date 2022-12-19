package Codeup;

import java.io.*;

public class Codeup81 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);

        for (int i=1; i<=a; i++) {
            for (int j=1; j<=b; j++) {
                bw.write(i + " " + j);
                bw.newLine();
            }
        }
        br.close();
        bw.close();
    }
}
