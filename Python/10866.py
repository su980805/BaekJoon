import sys
import collections
input=sys.stdin.readline;
list=collections.deque;

test=int(input());
arr=list();

for _ in range(test):
    cmd=input().rstrip().split();

    if(cmd[0]=="push_front"):
        arr.appendleft(cmd[1]);
    elif(cmd[0]=="push_back"):
        arr.append(cmd[1]);
    elif(cmd[0]=="pop_front"):
        print(arr.popleft() if len(arr) else -1);
    elif(cmd[0]=="pop_back"):
        print(arr.pop() if len(arr) else -1);
    elif(cmd[0]=="size"):
        print(len(arr));
    elif(cmd[0]=="empty"):
        print(1 if len(arr)==0 else 0);
    elif(cmd[0]=="front"):
        print(arr[0] if len(arr) else -1);
    else:
        print(arr[-1] if len(arr) else -1);