package src.backjoon.class2;
/* 1259 팰린드롬수 */
import java.io.*;

public class Baek_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            boolean result = true;
            String arr = br.readLine();

            if (arr.equals("0")) break;

            //i 입력받은 문자의 중간까지 반복
            for (int i=0; i<arr.length()/2; i++) {
            //i 앞뒤가 다르면 false
                if (arr.charAt(i) != arr.charAt(arr.length() - 1 - i)) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        br.close();
    }
}
