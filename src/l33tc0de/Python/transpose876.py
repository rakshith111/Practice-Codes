import time
import os

class Solution:
    def buildArray(matrix):
        r=len(matrix)
        c=len(matrix[0])
        res = [ [0]*r for i in range(c)]
        for i in range(0,r):
            for j in range(0,c):
                    res[j][i]=matrix[i][j]
        return res
mysol=Solution()
start=time.perf_counter()
nums=[[1,2,3],[4,5,6]]

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(ans)#output