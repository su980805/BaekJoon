import sys
from collections import deque

input=sys.stdin.readline;

def round_up(num):
    if(num-int(num)>=0.5):
        return int(num)+1;
    return int(num);

vote=int(input()); 
score=sorted([int(input()) for i in range(vote)]);
score=deque(score);

exception=round_up(vote*0.15);

for i in range(exception):
    score.pop();
    score.popleft();

try:
    print(round_up(sum(score)/(vote-2*exception)));
except:
    print(0);