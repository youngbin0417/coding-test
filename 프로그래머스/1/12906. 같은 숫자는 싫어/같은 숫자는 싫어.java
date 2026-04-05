import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : arr){
            if(stack.isEmpty()){
                stack.push(a);
            }
            else{
                int temp = stack.peek();
                if(temp!=a){
                    stack.push(a);
                }
            }
        }
        int size = stack.size();
        int[] answer = new int[stack.size()];
        for (int i = size-1; i>-1; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}