def solution(numbers):
    numbers.sort()
    n=len(numbers)
    return numbers[n-1]*numbers[n-2]
