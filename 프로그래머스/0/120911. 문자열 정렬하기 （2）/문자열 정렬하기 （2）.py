def solution(my_string):
    answer=[]
    st=''
    for my in my_string:
        tmp = ord(my)
        if tmp<97:
            tmp+=32
        answer.append(tmp)
    answer.sort()
    for ans in answer:
        st+=chr(ans)
    return st