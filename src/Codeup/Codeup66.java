package Codeup;

import java.io.*;

public class Codeup66 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);

        int[] data = {a,b,c};

        for (int abc : data) {
            if (abc % 2 == 1) {
                bw.write("odd");
                bw.write("\n");
            }
            if (abc % 2 == 0) {
                bw.write("even");
                bw.write("\n");
            }
        }
        br.close();
        bw.close();
    }
}
