import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int result=0;
        boolean map[][]=new boolean[101][101];

        for(int t=0;t<4;t++)
        {
            int x1=scanner.nextInt(), y1=scanner.nextInt(), x2=scanner.nextInt(), y2=scanner.nextInt();

            for(int i=x1;i<x2;i++)
            {
                for(int j=y1;j<y2;j++)
                {
                    if(!map[i][j])
                    {
                        map[i][j]=true;
                        result++;
                    }
                }
            }
        }
        System.out.print(result);
        
        scanner.close();
    }
}