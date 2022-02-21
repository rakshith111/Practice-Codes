import time
import os, psutil
class Solution:
    def buildArray(s):
        if len(s)%2!=0:
            s=s+"_"
        print(len(s))
        j=2
        i=0
        emp=[]
        while(j<=len(s)):
            emp.append(s[i:j])
            j+=2
            i+=2
        return emp




mysol=Solution()
start=time.perf_counter()
nums="asd"

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output