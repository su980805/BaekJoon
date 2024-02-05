import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int test=scanner.nextInt();
        char map[][]=new char[test][test];
        int length=0, height=0;

        for(int i=0;i<test;i++)//값 입력
        {
            String temp=scanner.next();
            for(int j=0;j<test;j++)
            {
                map[i][j]=temp.charAt(j);
            }
        }
        scanner.close();

        for(int i=0;i<test;i++)
        {
            int check_length=0, check_height=0;

            for(int j=0;j<test;j++)
            {
                if(map[i][j]=='.')//가로
                    check_length++;
                if(map[i][j]=='X' || j==test-1)
                {
                    if(check_length>=2)
                        length++;
                    check_length=0;
                }
                if(map[j][i]=='.')
                    check_height++;
                if(map[j][i]=='X' || j==test-1)
                {
                    if(check_height>=2)
                        height++;
                    check_height=0;
                }
            }
        }
        System.out.printf("%d %d",length,height);
    }
}