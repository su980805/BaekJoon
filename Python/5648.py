import sys
input=sys.stdin.readline;

test=input().rstrip().split();
num=[];

for i in test:
    num.append(i);

test=int(num.pop(0))-1;

while(test>1):
    cmd=input().rstrip().split();
    
    for i in cmd:
        num.append(i);
    test-=len(cmd);

for i in range(len(num)):
    num[i]=int(num[i][::-1]);

for i in sorted(num):
    print(i);