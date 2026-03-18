import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int p : priorities){
            queue.offer(p);
        }
        while(!queue.isEmpty()){
        // 가장 우선순위가 높은 놈 꺼내기
            int flag=0;
            int max=0;
            for(int i =0;i<queue.size();i++){
                int temp = queue.poll();
                if(max<temp){
                    max=temp;
                    flag=i;
                }
                queue.offer(temp);
            }
            System.out.println(queue);
            
            if(flag!=0){
                for(int i=0;i<flag;i++){
                    int temp = queue.poll();
                    queue.offer(temp);
                }
            }
            location-=flag;
            if (location<0){
                location=queue.size()+location;
            }
            
            queue.poll();
            location--;
            System.out.println(queue);
            System.out.println(flag);
            System.out.println(location);
            answer++;
            if(location==-1){
                return answer;
            }
        }
        
        
        return answer;
    }
}