import math
def solution(n, t):
    ans = 1
    for i in range(t):
        ans *= 2
    return n * ans