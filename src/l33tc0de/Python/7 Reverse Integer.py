#signed int input got to return its reversed value
class Solution:
    def reverse( x: int) -> int:
        if(x>=0):
            fin=int("".join(list(reversed(str(x)))))
            return (fin if(fin>-2**31 and fin<(2**31)-1) else '0')
        else:
            fin=int("".join(list(reversed(str(abs(x))))))
            return (-fin if(fin>-2**31 and fin<(2**31)-1) else '0')

            
k=Solution.reverse(int(-1239999))
print(k)