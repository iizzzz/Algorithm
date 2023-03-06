package src.programmers.고득점Kit.stackqueue;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<s.length(); i++) {
            // (가 들어갈 자리이면 스택에 넣는다
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                // )가 들어갈 자리인데 스택이 비어있을 경우 false 리턴
                if (stack.isEmpty()) {
                    return false;
                // ) 가 들어갈 상태에서 스택에 (가 있는 경우 (를 pop한다
                } else {
                    stack.pop();
                }
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}
