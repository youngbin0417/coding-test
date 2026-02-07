def solution(n):
    answer = []
    for i in range(2,n+1):
        if n%i==0:
            dup=0
            for ans in answer:
                if i%ans==0:
                    dup=1
            if dup==0:
                answer.append(i)
    return answer