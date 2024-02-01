import sys
input=sys.stdin.readline;

test=int(input()); cnt=0; deadline=-1; result=0;
score=[list(map(int,input().split())) for i in range(test)];

if(test<=5):
    print(0);
    exit(0);

score.sort(key=lambda x:(-x[0],x[1]));

for correct,penalty in score:
    cnt+=1;
    if(cnt==5):
        deadline=correct;
    if(cnt>5):
        if(correct==deadline):
            result+=1;
        else:
            break;

print(result);