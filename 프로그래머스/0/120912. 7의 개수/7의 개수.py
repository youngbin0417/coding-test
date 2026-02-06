def solution(array):
    answer = 0
    trg=''
    for arr in array:
        trg+=str(arr)
    for t in trg:
        if t == '7':
            answer+=1
    return answer