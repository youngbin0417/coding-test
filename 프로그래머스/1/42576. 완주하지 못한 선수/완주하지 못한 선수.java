import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant){
            map.put(p, map.getOrDefault(p,0)+1);
        }
        for (String c : completion){
            int count = map.get(c);
            if (count == 1){
                map.remove(c);
            }
            else{
                map.put(c, count-1);
            }
        }
        
        for (String key : map.keySet()) {
            return key; 
        }
        return "";
    }
}