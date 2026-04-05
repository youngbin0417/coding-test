
def solution(schedules, timelogs, startday):
        
    answer=0
    # day 1 2 3 4 5만 확인, 6 7은 pass
    for i in range(len(schedules)):
        day = startday
        hr = schedules[i]//100
        min = schedules[i]%100
        if min > 49:
            hr+=1
            min-=50
        else :
            min+=10
        schedule=int(hr*100+min)
        timelog = timelogs[i]
        answer+=1
        for time in timelog:
            if day>5:
                day+=1
                if day>7:
                    day-=7
            elif (day<6)and(time<=schedule):
                day+=1
                if day>7:
                    day-=7
            else:
                answer-=1
                print(i)
                break
    
    return answer