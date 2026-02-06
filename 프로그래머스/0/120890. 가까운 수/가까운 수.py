def solution(array, n):
    diff = 200
    ans = 0
    for arr in array:
        if abs(arr-n)<diff:
            diff = abs(arr-n)
            ans = arr
        if abs(arr-n)==diff:
            if ans > arr:
                ans=arr
            else:
                continue
    return ans