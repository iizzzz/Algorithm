package Codeup;

import java.io.*;

public class Codeup83 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i=1; i<=a; i++) {
            if ((i % 3 == 0)) {
                bw.write("X" + " ");
            } else {
                bw.write(i + " ");
            }
        }
        br.close();
        bw.close();
    }
}
