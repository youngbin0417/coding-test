def solution(n, w, num):
    answer = 1
    # 몇번째 줄에 있는지 찾기
    if(num%w==0):
        nh=num//w
    else:
        nh=num//w+1
            
    # 몇번째 줄 정보로 바로 윗줄의 몇번 번호까지 없애면 되는지 확인하기
    # 바로 위 번호는 (nh*w-자신)*2 + 1
    
    while(True):
        target = num + (nh*w-num) * 2 + 1
        print (nh, target)
        if n < target:
            break
        else:
            answer += 1
            nh+=1
            num=target
            
    
    return answer