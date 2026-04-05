import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int currentWeight=0;
        int truckIdx = 0;

        
        Deque<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.offerLast(0);
        }
        // 모든 트럭이 다리에 '진입'할 때까지 반복
        while (truckIdx < truck_weights.length) {
            time++;
            // rotate 로직
            currentWeight -= bridge.pollFirst();
            if (currentWeight + truck_weights[truckIdx] <= weight) {
                int nextTruck = truck_weights[truckIdx++];
                bridge.offerLast(nextTruck);
                currentWeight += nextTruck;
            } else {
                bridge.offerLast(0);
            }
        }
        
        return time + bridge_length;
    }
}