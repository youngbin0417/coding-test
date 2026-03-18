import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peekLast()] > prices[i]) {
                int index = stack.pollLast();
                answer[index] = i - index;
            }

            stack.offerLast(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.poll();
            answer[index] = prices.length - index - 1;
        }

        return answer;
    
    }
}