from collections import Counter
def solution(before, after):
    cnt1 = Counter(before)
    cnt2 = Counter(after)
    if cnt1==cnt2:
        return 1
    return 0