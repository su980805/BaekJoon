import sys
input=sys.stdin.readline;

test,frequency=map(int,input().split());
num=dict();

cmd=list(map(int,input().split()));

for i in cmd:
    if(i not in num):
        num[i]=1;
    else:
        num[i]+=1;

result=sorted(num.items(),key=lambda x:(-x[1]))

for i,j in result:
    for loop in range(j):
        print(i,end =' ');