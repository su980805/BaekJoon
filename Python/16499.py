import sys
input=sys.stdin.readline;

test=int(input());
result=dict();

for i in range(test):
    word=''.join(sorted(input().rstrip()));
    if(word not in result):
        result[word]=1;
    else:
        result[word]+=1;

print(len(result));