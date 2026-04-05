// 멘토 n명, 상담유형 k개 (k= 1 ~ 5), (k ≤ n ≤ 20)
// 멘토는 자신이 담당하는 유형만 가능, 참가자 한 명과 상담, 람가자가 요청한 시간만큼 걸림
// reqs: 3 ~ 300, [시각, 상담시간, 상담 유형], 시각을 기준으로 오름차순 정렬 되어있음
// 시각: 1~1000, 상담시간: 1~100, 상담유형: 1 ~ k, 시각 중복 없음

// 참가자 상담요청 순서
// 참가자의 상담 유형을 담당하는 멘토 중 상담 중이 아닌 멘토와 상담 시작
// 모두 상담 중이라면, 자신의 차례까지 대기. 기다린 시간은 상담요청~상담시작까지 걸린 시간
// 멘토는 기다리는 참가자 있으면 즉시 상담시작, 상담 요청 순서대로

// 기다린 시간의 합 최소 되도록 멘토 인원 정하기 (최소 각 유형별 1명 이상)
import java.util.*;
import java.lang.Math;

class Solution {
    public List<List<Integer>> mento_time = new ArrayList<>();
    public int answer;
    
    public class Request{
        int start_time;
        int counsel_time;
        int option;
        public Request(int a, int b, int c){
            this.start_time=a;
            this.counsel_time=b;
            this.option=c;
        }
        
        @Override
        public String toString(){
            return "Request{" +
            "start_time=" + start_time +
            ", counsel_time=" + counsel_time +
            ", option=" + option +
            '}';
        }
    }
    
    public int calculate_time(int n, List<Request> reqs){
        // n은 배정된 멘토 수, reqs는 현재 유형에 맞는 상담요청
        
        int total_waiting_time = 0;
        PriorityQueue<Integer> mentors = new PriorityQueue<>();
        
        for(int i=0;i<n;i++){
            mentors.offer(0);
        }
        
        for(Request r : reqs){
            int available_time = mentors.poll(); // 초기에 0 나옴
            
            if(available_time>r.start_time){
                total_waiting_time += available_time-r.start_time;
                mentors.offer(available_time+r.counsel_time);
            }
            else{
                mentors.offer(r.start_time+r.counsel_time);
            }
        }
        
        return total_waiting_time;
    }
    
    // 
    public void dfs(int depth, int remains, int time, int k){
        // depth는 현재 유형 갯수, remains 남은 멘토수, time 현재 까지 걸린 시간 수 합
        if(depth==k){
            answer = Math.min(answer, time);
            return;
        }
        else{
            for(int i=0; i<=remains-(k-depth);i++){
                int wait = mento_time.get(depth).get(i);
                dfs(depth+1, remains-(i+1), time+wait, k);
            }
        }
        return;
    }
    
    public int solution(int k, int n, int[][] reqs) {
        // reqs를 2차 arraylist로 변경. k=1일때 reqs[0]으로, k=2일때 reqs[1]로
        ArrayList<ArrayList<Request>> requests = new ArrayList<>();
        answer = Integer.MAX_VALUE;
        
        for(int i=0;i<k;i++){
            requests.add(new ArrayList<>());
        }
        
        for (int[] req : reqs){
            int tmp=req[2]-1;
            requests.get(tmp).add(new Request(req[0],req[1],req[2]));
        }
        
        //System.out.println(requests.get(0));
        //System.out.println(calculate_time(2, requests.get(0)));
        // 유형마다 멘토수에 따라 얼마나 걸리는지 각각 모두 계산후 저장
        // 유형별 최소 1명이라 남는 인원 n-(k-1)=n-k+1
        // 각 유형 멘토 수 범위 1~ n-k+2
        // 그 후  i j k 합이 n 임을 이용하여 최적해 구함
        
        for(int i=0;i<k;i++){
            mento_time.add(new ArrayList<>());
        }
        
        for(int i =0;i<k;i++){
            for(int j =0;j<n-k+1;j++){
                mento_time.get(i).add(calculate_time(j+1,requests.get(i)));
            }
        }
        //System.out.println(mento_time.get(1));
        
        // 행은 유형, 열은 유형에 배정된 멘토수
        // 일단 전수 계산함, mento_time 각 index 합=n-k일때임.
        // k 0~k-1, n 0~n-k
        //System.out.println(mento_time.size());
        dfs(0,n,0,k);
        
        return answer;
    }
}