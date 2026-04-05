def solution(array):
    val = array[0]
    index = 0
    for i in range(len(array)):
        if array[i] > val:
            val = array[i]
            index = i
    return [val, index]