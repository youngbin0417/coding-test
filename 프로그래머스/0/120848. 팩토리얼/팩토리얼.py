def solution(n):
    answer = 0
    if n ==1:
        return 1
    for i in range(1,11):
        fac=1
        for j in range(1,i+1):
            fac*=j
        if fac<=n:
            answer=i
            continue
        else:
            return answer
