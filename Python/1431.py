import sys
input=sys.stdin.readline;

def str2num(code):
    result=0;

    for i in code:
        if(i>='0' and i<='9'):
            result+=int(i);
    return result;

test=int(input());
guitar=sorted([input().rstrip() for i in range(test)],key=lambda x:(len(x),str2num(x),x));

for i in guitar:
    print(i);