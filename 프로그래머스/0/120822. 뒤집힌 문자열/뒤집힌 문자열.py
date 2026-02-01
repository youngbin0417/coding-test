def solution(my_string):
    answer = ''
    n=len(my_string)
    for i in range(n):
        answer+=my_string[n-i-1]
    return answer