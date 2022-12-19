package Codeup;

import java.io.*;

public class Codeup69 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char a = br.readLine().charAt(0);

        switch (a) {
            case'A': bw.write("best!!!"); break;
            case'B': bw.write("good!!"); break;
            case'C': bw.write("run!"); break;
            case'D': bw.write("slowly~"); break;
            default: bw.write("what?");
        }
        br.close();
        bw.close();
    }
}
