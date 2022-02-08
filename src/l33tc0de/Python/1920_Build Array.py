import time
class Solution:
    def buildArray(nums):
        return [nums[i] for i in nums]
          
mysol=Solution()
start=time.perf_counter()
nums=[5,0,1,2,3,4]

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(ans)#output