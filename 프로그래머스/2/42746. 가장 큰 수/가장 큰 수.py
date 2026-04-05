def solution(numbers):
    num=[]
    for n in numbers:
        num.append(str(n))
    num.sort(key = lambda x:x*3,reverse = True)
    answer = ''
    for a in num:
        answer +=a
    return str(int(answer))