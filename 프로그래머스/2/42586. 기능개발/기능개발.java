import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int progress=0;
        Queue<Integer> arr = new LinkedList<>();
        Queue<Integer> proque = new LinkedList<>();
        Queue<Integer> speque = new LinkedList<>();
        for (int p : progresses){
            proque.offer(p);
        }
        for(int s : speeds){
            speque.offer(s);
        }
        while(!proque.isEmpty()){
            progress = 0;
            int size = proque.size();
            //더하기
            for (int i=0; i<size; i++){
                int protemp=proque.poll();
                int spetemp=speque.poll();
                proque.offer(protemp+spetemp);
                speque.offer(spetemp);
            }
            //100넘는 거 갯수 찾기
            while(!proque.isEmpty()&&proque.peek()>=100){
                int protemp = proque.peek();
                if (protemp>=100){
                    progress++;
                    proque.poll();
                    speque.poll();
                }
                else{
                    break;
                }
            }
            if (progress>0){
                arr.offer(progress);
            }
        }
        //System.out.println(arr.size());
        int[] answer = new int[arr.size()];
        int size = arr.size();
        for (int v =0;v<size;v++){
            int temp=arr.poll();
            answer[v]=temp;
        }
        return answer;
    }
}
