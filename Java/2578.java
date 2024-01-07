import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner=new Scanner(System.in);
        
        int bingo[][]=new int[5][5], result=0;
        boolean check[][]=new boolean[5][5];
        
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                bingo[i][j]=scanner.nextInt();

        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                check[i][j]=false;
        
        for(int t=0;t<25;t++)
        {
            int cmd=scanner.nextInt();
            
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(bingo[i][j]==cmd)
                    {
                        check[i][j]=true;
                        result++;

                        if(is_win(check))
                        {
                            System.out.println(result);
                            scanner.close();
                            return ;
                        }
                    }
                }
            }        
        }
        scanner.close();
    }
    static boolean is_win(boolean check[][])
    {
        int result=0;
        
        for(int i=0;i<5;i++)
        {
            boolean row_bingo=true, col_bingo=true;

            for(int j=0;j<5;j++)
            {
                if(!check[i][j])
                    row_bingo=false;
                if(!check[j][i])
                    col_bingo=false;
            }
            if(row_bingo)
                result++;
            if(col_bingo)
                result++;
        }

        boolean dia_R_bingo=true, dia_L_bingo=true;

        for(int i=0;i<5;i++)
        {
            if(!check[i][i])
                dia_R_bingo=false;
            if(!check[i][4-i])
                dia_L_bingo=false;
        }
        if(dia_L_bingo)
            result++;
        if(dia_R_bingo)
            result++;
        
        if(result>=3) 
            return true;
        return false;
    }
}