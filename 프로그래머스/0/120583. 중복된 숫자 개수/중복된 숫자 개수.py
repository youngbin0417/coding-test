from collections import Counter
def solution(array, n):
    array=Counter(array)
    return array[n]