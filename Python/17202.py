import sys
input=sys.stdin.readline;

phone_1=list(input()); phone_1.pop();
phone_2=list(input()); phone_2.pop();

temp=[]; result="";

for i in range(8):
    result+=phone_1[i]+phone_2[i];

while(len(result)!=2):
    for i in range(len(result)-1):
        temp.append(str((int(result[i])+int(result[i+1]))%10));
    result=''.join(temp);
    temp.clear();

print(result);