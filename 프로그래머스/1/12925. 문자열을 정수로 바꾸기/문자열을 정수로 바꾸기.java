import java.lang.Math;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int size = s.length();
        boolean buho=true;
        int idx=0;
        
        if(s.charAt(0)=='+'){
            idx=1;
        }
        else if(s.charAt(0)=='-'){
            buho=false;
            idx=1;
        }
        
        for(int i =idx;i<size;i++){
            int cur = (int) s.charAt(i)-48;
            System.out.println(cur);
            answer+=Math.pow(10,(size-i-1))*cur;
        }
        if(!buho){
            answer = answer*(-1);
        }
        return answer;
    }
}