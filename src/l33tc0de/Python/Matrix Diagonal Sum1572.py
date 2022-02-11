import time
import os, psutil
class Solution:
    def buildArray(mat):
        sum=0
        size=len(mat)
        c=size-1
        r=0
        print(r,c)
        for i in range(0,size):
            sum+=mat[i][i]
        for i in range(0,size//2):
            sum+=mat[r][c]+mat[c][r]
            r+=1
            c-=1
        return sum 



mysol=Solution()
start=time.perf_counter()
nums=[[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output