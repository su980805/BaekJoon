import sys
input=sys.stdin.readline;

n,k=map(int,input().split());
people=[i for i in range(1,n+1)];
remove=0;

print('<',end='');
for i in range(n-1):
    remove+=k-1;
    if(remove>=len(people)):
        remove%=len(people);
    print(people.pop(remove),end=', ');
print(people[0],end='>');