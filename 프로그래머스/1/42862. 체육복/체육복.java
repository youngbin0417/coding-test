import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n-lost.length;
        List<Integer> losts = new ArrayList<>();
        List<Integer> reserves = new ArrayList<>();
        for(int r : reserve) {reserves.add(r);}
        for(int l : lost) {losts.add(l);}
        
        // 셀프 확인
        Iterator<Integer> itl = losts.iterator();
        while(itl.hasNext()){
            int t1=itl.next();
            Iterator<Integer> itr = reserves.iterator();
            while(itr.hasNext()){
                int t2=itr.next();
                if (t1==t2){
                    itr.remove();
                    itl.remove();
                    answer++;
                    break;
                }
            }
        }
        //찐확인
        Iterator<Integer> itnl = losts.iterator();
        while(itnl.hasNext()){
            int t1=itnl.next();
            Iterator<Integer> itnr = reserves.iterator();
            while(itnr.hasNext()){
                int t2=itnr.next();
                if (t1-1==t2){
                    itnr.remove();
                    itnl.remove();
                    answer++;
                    break;
                }
                else if(t1+1==t2){
                    itnr.remove();
                    itnl.remove();
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}