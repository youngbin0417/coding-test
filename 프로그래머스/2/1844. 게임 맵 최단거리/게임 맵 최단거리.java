import java.util.*;

class Solution {
    
    public int solution(int[][] maps) {
        int n=maps.length;
        int m=maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0,0,1});
        visited[0][0]=true;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist=cur[2];
            
            //종료조건
            if(x==n-1 && y==m-1){
                return dist;
            }
            
            /*4방향 탐색
            if로 map 범위 이내 확인 -> if로 map의 해당값이 1인지 확인 후,
            맞다면 해당 좌표,dist+1해서 offer함
            */
            if(x-1>-1){
                if(maps[x-1][y]==1 && visited[x-1][y]==false){
                    queue.offer(new int[]{x-1,y,dist+1});
                    visited[x-1][y]=true;
                }
            }
            if(x+1<n){
                if(maps[x+1][y]==1 && visited[x+1][y]==false){
                    queue.offer(new int[]{x+1,y,dist+1});
                    visited[x+1][y]=true;
                }
            }
            if(y-1>-1){
                if(maps[x][y-1]==1 && visited[x][y-1]==false){
                    queue.offer(new int[]{x,y-1,dist+1});
                    visited[x][y-1]=true;
                }
            }
            if(y+1<m){
                if(maps[x][y+1]==1 && visited[x][y+1]==false){
                    queue.offer(new int[]{x,y+1,dist+1});
                    visited[x][y+1]=true;
                }
            }
            
        }
        
        return -1;
    }
}