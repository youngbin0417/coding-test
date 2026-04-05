def solution(n, computers):
    visited = [0]*n # 노드 방문 기록
    cnt=0 # 네트워크 개수
    
    def search(base):
        visited[base] = 1
        for i in range(n):
            if(computers[base][i]==1 and visited[i]==0):
                search(i)
            else:
                continue
                
    for i in range(n):
        if(visited[i]==0):
            search(i)
            cnt+=1
    
    return cnt