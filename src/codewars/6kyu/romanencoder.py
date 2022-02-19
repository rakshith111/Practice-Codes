import time
import os, psutil
class Solution:
    def buildArray(roman):
        final_num=0
        order={ 'I':1,
                'V':5,
                'X':10,
                'L':50,
                'C':100,
                'D':500,
                'M':1000}
        for pair in range(0,len(roman)):
            my_str=(roman[pair:pair+2])
           # print(my_str)
            if(len(my_str)>1):
                if order[my_str[0]]<order[my_str[1]]:
                    final_num-=order[my_str[0]]
                    #print(final_num)
                else:
                    final_num+=order[my_str[0]]
                   # print(final_num)
            else:
                final_num+=order[my_str[0]]
        return final_num


            
           
      


mysol=Solution()
start=time.perf_counter()
nums="MCMXXX"

ans=Solution.buildArray(nums)#input
stops=time.perf_counter()
print(f'exectime= {(stops-start)*1000:.4f} ms\nans\n')
print(f'mem used={(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2):.3f} mb')
print(ans)#output