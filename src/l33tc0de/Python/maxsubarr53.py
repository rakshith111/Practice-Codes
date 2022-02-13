import time
import os, psutil
class Solution:
    def buildArray(nums):
        #BRUTE FORCE SOLN
        # siz=len(nums)
        # max=sum(nums)
        # if siz>1:
        #         sets = [[]]
                
        #         for start in range( siz+ 1):
        #             for end in range(start):
        #                 cmax=sum(nums[end: start])
        #                 if(cmax>=max):
        #                     max=cmax
        #         return max
        # else:
        #     return sum(nums)
        # kadane's algo
        cmax = 0
        max = -1e8
        for element in nums:
            cmax += element
            if cmax > max: max = cmax
            if cmax < 0: cmax = 0
        return max

        

mysol=Solution()
start=time.perf_counter()
nums=[-2,-1,4,5,6,1]   

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output