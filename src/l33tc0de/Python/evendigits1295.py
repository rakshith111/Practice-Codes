import time
class Solution:
    
    def buildArray(nums):
        sum=0
        for i in nums :
            if len(str(i))%2==0:
                sum+=1
        return sum



mysol=Solution()
start=time.perf_counter()
nums=[12,345,2,6,7896]

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(ans)#output