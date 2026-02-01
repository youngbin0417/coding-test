def solution(order):
    order=str(order)
    ans=0
    cl = ['3','6','9']
    for lt in order:
        if lt in cl:
            ans+=1
    return ans