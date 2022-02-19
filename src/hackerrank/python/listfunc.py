if __name__ == '__main__':
    N = int(input())
    cmds=[]
    tempar=[]
    for i in range(N):
        cmds.append(input().split(" "))
    for i in cmds:
        print(i[0])
        if i[0] == "insert":
            for iitem in (i[1:]):
                tempar.append(int(iitem))
        elif i[0] == "remove ":
            tempar.remove(int(i[1]))
        elif i[0] == "append":
            tempar.append(int(i[1]))
        elif i[0] == "pop":
            print(i)
            
            tempar.pop()
        elif i[0] == "print":
            print(tempar)
        elif i[0] == "sort":
            tempar.sort
        elif i[0] == "reverse":
            tempar.sort(reverse=1)

    