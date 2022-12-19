package Codeup;

import java.io.*;

public class Codeup75 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        a--;

        while (a >= 0) {
            bw.write(String.valueOf(a--));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
