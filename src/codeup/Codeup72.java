package src.codeup;

import java.io.*;

public class Codeup72 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        String[] num = br.readLine().split(" ");

        for (String s: num) {
            bw.write(s);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
