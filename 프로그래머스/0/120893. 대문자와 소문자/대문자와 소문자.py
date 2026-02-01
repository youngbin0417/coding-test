def solution(my_string):
    ans=''
    for st in my_string:
        st = ord(st)
        if st<97:
            st+=32
            ans+=chr(st)
        else:
            st-=32
            ans+=chr(st)
    return ans
