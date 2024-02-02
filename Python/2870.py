import sys
input=sys.stdin.readline;

test=int(input());
result=[];

for T in range(test):
    cmd=list(input().rstrip());
    num="";

    for i in range(len(cmd)):
        if(cmd[i]>='0' and cmd[i]<='9'):
            num+=cmd[i];
        else:
            if(len(num)!=0):
                result.append(int(num));
                num="";
        
        if(i+1==len(cmd) and len(num)!=0):
            result.append(int(num));

for i in sorted(result):
    print(i)