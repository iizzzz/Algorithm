package src.backjoon.class1;

import java.io.*;

public class Baek_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if (a >= 90) {
            bw.write("A");
        } else if (a >= 80) {
            bw. write("B");
        } else if (a >= 70) {
            bw.write("C");
        } else if (a >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        }
        br.close();
        bw.close();
    }
}
