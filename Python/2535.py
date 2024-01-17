import sys
input=sys.stdin.readline;

test=int(input()); rank=1;
contest=sorted([list(map(int,input().split())) for i in range(test)],key=lambda x:-x[2]);
#국가, 학생, 성적

get_medal=dict();

for country,student,score in contest:
    if(rank>3): 
        break;

    if(country not in get_medal):
        get_medal[country]=1;
    else:
        if(get_medal[country]>2):
            continue;
    
    get_medal[country]+=1;
    rank+=1;

    print(country,student);