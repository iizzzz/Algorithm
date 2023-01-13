package src.codeup;

import java.io.*;

public class Codeup79 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");

        for (int i=0; i<a.length; i++) {
            bw.write(a[i]);
            bw.newLine();
            if (a[i].equals("q")) break;
        }
        br.close();
        bw.close();
    }
}
