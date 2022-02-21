import time
import os, psutil
class Solution:
    def buildArray(text):
        text=text.lower()
        x={}
        k=0
        for i in text :
            if x.get(i,0):
                x[i]+=1
            else:
                x[i]=1
        for i in x.values():
            if i>1:
                k+=1        
        print(k)



mysol=Solution()
start=time.perf_counter()
nums="Indivisibilities"

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output