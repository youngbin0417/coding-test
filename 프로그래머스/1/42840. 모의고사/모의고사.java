import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] result = new int[3];
        int max=0;
        List<Integer> arr = new ArrayList<>();
        // 1번 수포자 1,2,3,4,5 반복 (5개)
        Queue<Integer> can1 = new LinkedList<>();
        can1.add(1);
        can1.add(2);
        can1.add(3);
        can1.add(4);
        can1.add(5);
        // 2번 수포자 2,1,2,3,2,4,2,5 반복 (8개)
        Queue<Integer> can2 = new LinkedList<>();
        can2.add(2); can2.add(1);
        can2.add(2); can2.add(3);
        can2.add(2); can2.add(4);
        can2.add(2); can2.add(5);
        // 3번 수포자 3,3,1,1,2,2,4,4,5,5 반복 (10개)
        Queue<Integer> can3 = new LinkedList<>();
        can3.add(3); can3.add(3);
        can3.add(1); can3.add(1);
        can3.add(2); can3.add(2);
        can3.add(4); can3.add(4);
        can3.add(5); can3.add(5);
        
        for(int a : answers){
            int c1=can1.poll();
            int c2=can2.poll();
            int c3=can3.poll();
            if(a==c1){
                result[0]++;
            }
            if(a==c2){
                result[1]++;
            }
            if(a==c3){
                result[2]++;
            }
            can1.offer(c1);
            can2.offer(c2);
            can3.offer(c3);
        }
        //가장 큰놈 찾기
        if(result[0]>=result[1]){
            if(result[0]>=result[2]){
                max=result[0];
            }
            else{max=result[2];}
        }
        else{
            if(result[1]>=result[2]){
                max=result[1];
            }
            else {max=result[2];}
        }
        int cnt=0;
        for (int i=0;i<3;i++){
            if(max==result[i]){
                arr.add(i+1);
            }
        }
        int siz=arr.size();
        int[] r = new int[siz];
        for (int j=0;j<siz;j++){
            r[j]=arr.get(j);
        }
        return r;
    }
}