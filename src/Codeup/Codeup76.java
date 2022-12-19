package Codeup;

import java.io.*;

public class Codeup76 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char a = (char)br.read();

        for (char i='a'; i<=a; i++) {
            bw.write(i + " ");
        }
        br.close();
        bw.close();
    }
}
