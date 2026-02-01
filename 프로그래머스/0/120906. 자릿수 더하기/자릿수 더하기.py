def solution(n):
    ans=0
    st=str(n)
    for i in range(len(st)):
        ans+=n%10
        n=n//10
    return ans