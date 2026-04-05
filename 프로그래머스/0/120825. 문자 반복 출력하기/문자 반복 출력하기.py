def solution(my_string, n):
    answer = ''
    for st in my_string:
        for i in range(n):
            answer+=st
    return answer