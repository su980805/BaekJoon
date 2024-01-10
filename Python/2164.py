import sys
import collections
input=sys.stdin.readline;

test=int(input());
card=collections.deque([i for i in range(1,test+1)]);

while(len(card)>1):
    card.popleft();
    card.append(card.popleft());

print(card[0]);