import sys
input=sys.stdin.readline;

test=int(input());
extend=dict();

for T in range(test):
    cmd=input().rstrip().split('.');

    if(cmd[1] not in extend):
        extend[cmd[1]]=1;
    else:
        extend[cmd[1]]+=1;

extend=sorted(extend.items(),key=lambda x:(x[0]));

for extend_name,cnt in extend:
    print(extend_name,cnt);