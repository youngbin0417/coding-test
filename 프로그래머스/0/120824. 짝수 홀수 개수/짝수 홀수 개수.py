def solution(nums):
    even=0
    odd=0
    for num in nums:
        if num%2==0:
            even+=1
        else:
            odd+=1
    return [even,odd]