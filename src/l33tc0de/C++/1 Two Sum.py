#array input got to return the indices of the arr which add up to target
nums = [int(item) for item in input().split()]
target=int(input())
# tem=nums
# for i in range(0,len(nums)):
#     res=target-nums[i]
#     tem.insert(i,'/')
#     tem.remove(nums[i+1])
#     if(res in tem):
#         print(i,tem.index(res)) # Or returned 
#         break
#     tem=nums