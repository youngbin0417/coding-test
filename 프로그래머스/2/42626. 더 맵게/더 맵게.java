import java.util.*;

class Solution {
    public int solution(int[] scoville, int k) {
        int answer = 0;
        
        PriorityQueue<Integer> foods = new PriorityQueue<>();
        //PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int s : scoville){
            foods.offer(s);
        }
        //System.out.println(foods);
        while(foods.size()>1){
            int flag =0;
            /*전체 다 k 이상인지 확인*/
            for(int f:foods){
                if(f<k){
                    flag++;
                    break;
                }
            }
            if(flag==0){
                return answer;
            }
            
            int min1 = foods.poll();
            int min2 = foods.poll();
            foods.offer(min1+2*min2);
            answer++;
        }
        if(foods.peek()<k){
            return -1;
        }
        return answer;
    }
}