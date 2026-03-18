import java.util.*;

class Solution {
    public int solution(int[] citations) {
        List<Integer> list = new ArrayList<>();
        for (int c : citations){
            list.add(-c);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            int tp = list.get(i);
            tp*=-1;
            list.set(i, tp);
        }
        System.out.println(list);
        
        for(int i=list.get(0);i>-1;i--){
            int count =0;
            for(int j=0;j<list.size();j++){
                if(list.get(j)>=i){
                    count++;
                }
            }
            System.out.println(count);

            if (count>=i){
                return i;
            }
        }
        return 0;
    }
}