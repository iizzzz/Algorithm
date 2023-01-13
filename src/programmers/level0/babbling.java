package src.programmers.level0;

public class babbling {

    public int solution(String[] babbling) {

        int answer = 0;

        String[] origin = {"aya", "ye", "woo", "ma"};

        for (String a : babbling) {
            for (String b : origin) {
                a = a.replaceFirst(b, " ");
            }
            if (a.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
