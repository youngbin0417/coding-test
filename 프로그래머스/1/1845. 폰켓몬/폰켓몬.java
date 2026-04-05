import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int total = (nums.length) / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        int kind = 0;
        for (Integer key : map.keySet()){
            kind++;
        }
        System.out.println(kind);
        if (kind<=total){
            answer=kind;
        }
        else{
            answer=total;
        }

        return answer;
    }
}