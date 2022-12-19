package Codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup92 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] num = br.readLine().split(" ");

            String d = String.valueOf(_day(num[0], num[1], num[2]));
            bw.write(d);
            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {
        }
    }

    public static int _day(String a1, String b1, String c1) {
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int day = 1;
        do {
            if (day % a == 0 && day % b == 0 && day % c == 0) {
                break;
            }
            day++;
        } while (true);
        return day;
    }
}
