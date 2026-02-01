def solution(s1, s2):
    cnt = 0
    for sa in s1:
        for sb in s2:
            if sa==sb:
                cnt+=1
    return cnt