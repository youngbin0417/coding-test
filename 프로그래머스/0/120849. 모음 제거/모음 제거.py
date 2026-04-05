def solution(my_string):
    answer = ''
    moeum=['a','e','i','o','u']
    for st in my_string:
        if st not in moeum:
            answer+=st
    return answer