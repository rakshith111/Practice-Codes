import time
import os, psutil
class Solution:
    def buildArray(mat,r,c):
        flat_list = [item for sublist in mat for item in sublist]
        if (r*c==len(flat_list)):
            res=[[0]*c for i in range(r)]
            k=0
            for i in range(0,r):
                for j in range(0,c):
                    res[i][j]=flat_list[k]
                    k+=1
        else:
            return mat
        return res
        

mysol=Solution()
start=time.perf_counter()
nums=[[1,2],[3,4],[1,2],[3,4]]
r = 2
c = 4

ans=Solution.buildArray(nums,r,c)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output