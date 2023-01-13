package src.codeup;

import java.io.*;

public class Codeup77 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i=0; i<=a; i++) bw.write(i + "\n");
        br.close();
        bw.close();
    }
}
