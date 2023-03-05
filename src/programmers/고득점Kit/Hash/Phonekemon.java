package src.programmers.고득점Kit.Hash;

import java.util.HashSet;

public class Phonekemon {
    public int solution(int[] nums) {
        // 총 수에 2를 나눔
        int max = nums.length / 2;

        // 중복을 제거하는 Integer Set 생성
        HashSet<Integer> hashSet = new HashSet<>();

        // Set에 데이터를 넣음으로서 중복된 데이터를 제거 한다
        for (int n : nums) {
            hashSet.add(n);
        }

        // 중복을 제거한 Set의 크기가 max보다 크면 max, 작으면 set 사이즈 리턴
        if (max >= hashSet.size()) {
            return hashSet.size();
        } else {
            return max;
        }
    }
}
