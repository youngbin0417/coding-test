def solution(my_string, letter):
    answer= ''
    for st in my_string:
        if st != letter:
            answer+=st
    return answer