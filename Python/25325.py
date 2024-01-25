import sys
input=sys.stdin.readline;

test=int(input());
temp=list(input().rstrip().split());
students=dict();

for i in temp:
    students[i]=0;

for i in range(test):
    cmd=list(input().rstrip().split());

    for j in cmd:
        students[j]+=1;

result=sorted(students.items(),key=lambda x:(-x[1],x[0]));

for name,score in result:
    print(name,score);