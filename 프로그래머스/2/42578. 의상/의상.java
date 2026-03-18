import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int ans=1;
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, Integer>kindmap = new HashMap<>();
        for(String[] cloth : clothes){
            map.put(cloth[0],cloth[1]);
        }
        for (String value : map.values()){
            kindmap.put(value, kindmap.getOrDefault(value,0)+1);
        }
        for (String key : kindmap.keySet()){
            int temp = kindmap.get(key);
            ans *= (temp+1);
        }
        return ans-1;
    }
}