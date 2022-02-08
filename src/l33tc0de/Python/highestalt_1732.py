class Solution:
    def largestAltitude(self, gain: list[int]) -> int:
        final=[]
        final.append(0)
        for item in gain:
            k=final[-1]+ item
            final.append(k)
        return max(final)