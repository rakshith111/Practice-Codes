import time
import os, psutil
class Solution:
    def buildArray(cc):
        if len(cc)<5:
            return cc
        else:
            k=len(cc)-4
            print(k*"#"+cc[k:])



mysol=Solution()
start=time.perf_counter()
nums='SF$SDfgsd2eA'

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output