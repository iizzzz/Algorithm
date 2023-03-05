package src.programmers.고득점Kit.Hash;

import java.util.HashMap;

public class 전화번호목록 {

    static String[] s = {"119", "97674223", "1195524421"};
    static String[] a = {"123", "456", "789"};

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        /* phone_book 배열을 돌면서 각 요소를 substring으로  */
        for (int i=0; i<phone_book.length; i++) {
            for (int j=1; j<phone_book[i].length(); j++) {
                map.put(phone_book[i].substring(0, j), 1);
            }
        }

        for (int i=0; i<phone_book.length; i++) {
            if (map.containsKey(phone_book[i])) {
                answer = false;
                break;
            } else {
                map.put(phone_book[i], 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(s));
    }
}
