package src.programmers.고득점Kit.Hash;

import java.util.*;

public class 베스트앨범 {
    static class Song {
        String genre;
        int play;
        int idx;

        public Song(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 장르 선정
        ArrayList<String> genList = new ArrayList<>();
        while (map.size() != 0) {
            int max = -1;
            String maxKey = "";

            for (String key : map.keySet()) {
                int tmp = map.get(key);
                if (tmp >= max) {
                    max = tmp;
                    maxKey = key;
                }
            }
            genList.add(maxKey);
            map.remove(maxKey);
        }

        // 장르 내 노래 선정
        ArrayList<Song> result = new ArrayList<>();
        for (String gen : genList) {
            ArrayList<Song> list = new ArrayList<>();
            for (int i=0; i<genres.length; i++) {
                if (genres[i].equals(gen)) {
                    list.add(new Song(gen, plays[i], i));
                }
            }
            // 내림차순 정렬
            Collections.sort(list, ((o1, o2) -> o2.play - o1.play));
            // 1개는 무조건 등록
            result.add(list.get(0));
            // 더 등록할 곡이 있으면 (장르 내 노래가 1개보다 많으면) 등록
            if (list.size() != 1) {
                result.add(list.get(1));
            }
        }

        // 결과 출력
        int[] answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i).idx;
        }
        return answer;
    }
}