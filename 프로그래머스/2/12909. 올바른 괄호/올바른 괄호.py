def solution(s):
    letters = []
    checking = []
    for a in s:
        letters.append(a)
    
    for letter in letters:
        if letter == '(':
            checking.append(letter)
        elif letter ==')' and len(checking)!=0:
            checking.pop()
        else:
            return False
        
    if len(checking)==0:
        return True
    return False