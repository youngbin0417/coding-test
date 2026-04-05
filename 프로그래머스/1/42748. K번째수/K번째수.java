import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int idx=0;
        int[] answer = new int[n];
        for (int[] c : commands){
            int i=c[0];
            int j=c[1];
            int k=c[2];
            List<Integer> arr = new ArrayList<>();
            for(int id = i-1;id<j;id++){
                arr.add(array[id]);
            }
            Collections.sort(arr);
            System.out.println(arr);
            answer[idx++]=arr.get(k-1);
        }
        return answer;
    }
}