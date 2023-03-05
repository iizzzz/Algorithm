package src.programmers.고득점Kit.Hash;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        // 중복제거하면서 순회하고 인원수 +1
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
            System.out.println();
        }

        // 순회하면서 완주한 선수에 대해 -1
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }

        // -1이 되지 못한 선수(Value가 1인 선수)를 answer에 담는다
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
