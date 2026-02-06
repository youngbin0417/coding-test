def solution(num_list, n):
    answer=[]
    for i in range(0,len(num_list),n):
        tmp = []
        for j in range(i,i+n):
            tmp.append(num_list[j])
        answer.append(tmp)
    return answer