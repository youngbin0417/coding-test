import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> lis = new ArrayList<>();
        int idx=0;
        for(String name : names){
            if(idx%5==0){
                lis.add(name);
            }
            idx++;
        }
        idx=0;
        String[] answer = new String[lis.size()];
        for(String l :lis){
            answer[idx++]=l;
        }
        return answer;
    }
}