package src.codeup;

import java.io.*;

public class Codeup61 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        bw.write(String.valueOf(a | b));
        br.close();
        bw.close();
    }
}
