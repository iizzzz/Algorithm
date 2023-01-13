package src.codeup;

import java.io.*;

public class Codeup73 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        for (int i=0; i<num.length; i++) {
            if (num[i].equals("0")) {
                break;
            } else {
                bw.write(num[i] + "\n");
            }
        }
        br.close();
        bw.close();
    }
}
