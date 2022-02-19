import time
import os, psutil
class Solution:
    def buildArray(nums):
        x={}
        k=0
        for i in nums :
            if x.get(i,0):
                x[i]+=1
            else:
                x[i]=1
        for key,valu in x.items():
            if valu%2!=0:
                return key



mysol=Solution()
start=time.perf_counter()
nums=[20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5]

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output