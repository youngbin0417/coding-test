def solution(my_string):
    answer = 0
    nums = [0]
    num=''
    for my in my_string:
        if ord(my)>47 and ord(my) < 58:
            num+=my
        else:
            if num == '':
                continue
            else:
                nums.append(num)
                num=''
    if num != '':
        nums.append(num)
    for n in nums:
        answer += int(n)
    return answer