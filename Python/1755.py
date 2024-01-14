import sys
input=sys.stdin.readline;

int2str=['zero','one','two','three','four','five','six','seven','eight','nine'];
start,end=map(int,input().split());

num=dict();

for i in range(start,end+1):
    temp=list(str(i));
    value="";

    for j in temp:
        value+=int2str[int(j)];
    
    num[int(i)]=value; #띄우기 고려 X

result=sorted(num.items(),key=lambda x:(x[1]));

for i in range(len(result)):
    print(result[i][0],end=' ');

    if((i+1)%10==0): #인덱스는 0번 시작이므로 보정
        print();