package src.codeup;

import java.io.*;

public class Codeup68 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if (a>=90) {
            bw.write("A");
        } else if (a >= 70) {
            bw.write("B");
        } else if (a >= 40) {
            bw.write("C");
        } else {
            bw.write("D");
        }
        br.close();
        bw.close();
    }
}
