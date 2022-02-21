import time
import os, psutil
class Solution:
    def find_outlier(nums):
        fe=0 #even cnt
        fo=0 #odd cnt
        #init check for parity of first 3 nums
        for i in nums[:3]:
          if i%2==0:
              fe+=1
   
          else:
              fo+=1

        if fo>fe:
            for n in nums:
                if n%2==0:
                    return n
        else:
            for n in nums:
                if n%2!=0:
                    return n

            



mysol=Solution()
start=time.perf_counter()
nums=[160, 3, 1719, 19, 11, 13, -21]

ans=Solution.find_outlier(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output