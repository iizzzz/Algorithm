package src.programmers.고득점Kit.완전탐색;

import java.util.Arrays;

public class 최소직사각형 {

    static int[][] testA ={{60,50}, {30,70}, {60,30}, {80,40}};

    public static void main(String[] args) {
//        solution(testA);
        solution2(testA);
    }

    // Stream을 이용한 풀이
    public static int solution(int[][] sizes) {
        // 가로의 큰 값들의 Max
        int w = Arrays.stream(sizes)
                .mapToInt(size -> Math.max(size[0], size[1]))
                .max()
                .getAsInt();

        // 세로의 작은 값들의 Max
        int h = Arrays.stream(sizes)
                .mapToInt(size -> Math.min(size[0], size[1]))
                .max()
                .getAsInt();

        return w * h;
    }

    // Loop를 이용한 풀이
    public static int solution2(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            // 60 vs 50 = 60
            // 60 vs 70 = 70
            // 70 vs 60 = 70
            // 70 vs 80 = 80
            w = Math.max(w, Math.max(size[0], size[1]));
            System.out.println("max"+w);

            // 60 vs 50 = 50
            // 50 vs 30 = 50
            // 50 vs 30 = 50
            // 50 vs 40 = 50
            h = Math.max(h, Math.min(size[0], size[1]));
            System.out.println("min"+h);
        }
        System.out.println("result" + w*h);
        return w * h;
    }
}
