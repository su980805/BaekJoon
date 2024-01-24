import sys
input=sys.stdin.readline;

test=int(input());
cnt=0;
user=dict();

for T in range(test):
    cmd=input().rstrip();
    
    if(cmd=="ENTER"):
        user.clear();
        continue;

    if(cmd not in user):
        user[cmd]=1;
        cnt+=1;

print(cnt);