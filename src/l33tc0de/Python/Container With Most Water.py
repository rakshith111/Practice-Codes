from typing import List
from time import time
#general brute force method
class Solution:
    def maxArea(height: List[int]) -> int: 
        size=len(height)
        arealist=[0]
        while(size>1): 
            init=height[0]
            for i in range(0,size):
                val=(init*i if init<height[i] else height[i]*i)
                if val> max(arealist): arealist.append(val)
            height.pop(0)
            size=size-1
        return max(arealist)
start=time()
k=Solution.maxArea([17,84,58,48,40,91,54,35,97,17,40,59,57,61,23,15,68,93,72,2,34,66,66,0,37,1,14,23,94,88,69,95,29,90,26,40,67,25,58,20,58,72,83,47,6,15,62,72,16,89,13,63])

print(k,f'Time taken: {time() - start}')