# ip=[[3,2],[4,2],[6,2],[2,3],[6,7],[8,7],[8,6],[10,6],[11,6]]
ip=[[1,2]]
Trusted = [0] * (2+1)
for (a, b) in ip:
	Trusted[a] -= 1
	Trusted[b] += 1
print(Trusted)