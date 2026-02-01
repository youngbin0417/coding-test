def solution(my_string):
    answer = 0
    for st in my_string:
        st = ord(st)
        if st>47 and st<58:
            answer+=int(chr(st))
    return answer