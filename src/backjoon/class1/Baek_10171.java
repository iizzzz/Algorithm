package src.backjoon.class1;

import java.io.*;

public class Baek_10171 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine();

        bw.write(" )  ( ')");
        bw.newLine();

        bw.write("(  /  )");
        bw.newLine();

        bw.write(" \\(__)|");

        bw.flush();
        bw.close();
    }
}
