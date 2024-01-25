import sys
input=sys.stdin.readline;

test=int(input()); cnt=1; #ChongChong는 춤추고 있음
state={"ChongChong":True};

for T in range(test):
    start,end=input().rstrip().split();

    if(start not in state):
        state[start]=False;
    if(end not in state):
        state[end]=False;
    
    if(state[start] and state[end]!=True):
        state[end]=True;
        cnt+=1;
    if(state[end] and state[start]!=True):
        state[start]=True;
        cnt+=1;

print(cnt);