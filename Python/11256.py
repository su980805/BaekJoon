import sys
input=sys.stdin.readline;

test=int(input());

for T in range(test):
    candy,box=map(int,input().split());
    box_list=sorted([list(map(int,input().split())) for i in range(box)],key=lambda x:-(x[0]*x[1]));
    
    cnt=0;
    while(candy>0):
        for length,width in box_list:
            candy-=length*width;
            cnt+=1;

            if(candy<=0 or cnt==box):
                print(cnt);
                break;