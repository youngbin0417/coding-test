import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        HashMap<String, Integer> map = new HashMap<>();
        for (String number : phone_book){
            map.put(number,1);
        }
        for (String number : phone_book){
            for (int i=0; i<number.length(); i++){
                if(map.containsKey(number.substring(0,i))){
                    return false;
                }
            }
        }
        
        
        return true;
    }
}