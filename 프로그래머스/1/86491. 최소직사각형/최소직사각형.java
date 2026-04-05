import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        List<Integer> big = new LinkedList<>();
        List<Integer> small = new LinkedList<>();
        int n=0;
        for(int[] s : sizes){
            if(s[0]>=s[1]){
                big.add(s[0]);
                small.add(s[1]);
            }
            else{
                big.add(s[1]);
                small.add(s[0]);
            }
            n++;
        }

        Collections.sort(big);
        Collections.sort(small);
        
        int answer = big.get(n-1) * small.get(n-1);
        return answer;
    }
}