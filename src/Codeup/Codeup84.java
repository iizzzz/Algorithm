package Codeup;

import java.io.*;

public class Codeup84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int c = 0;

        for (int i = 0; i<Integer.parseInt(num[0]); i++) {
            for (int j = 0; j<Integer.parseInt(num[1]); j++) {
                for (int k = 0; k<Integer.parseInt(num[2]); k++) {
                    bw.write(String.format(i+" "+j+" "+k+"\n"));
                    c++;
                }
            }
        }
        bw.write(String.valueOf(c));
        br.close();
        bw.close();
    }
}
