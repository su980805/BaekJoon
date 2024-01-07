import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner=new Scanner(System.in);
        
        int num=scanner.nextInt(), size[]=new int[105], cnt=3;
        boolean flag=true;

        size[0]=2; size[1]=4; size[2]=6;

        for(int i=3;i<=num;i++)
        {
            if(flag)
                size[i]+=(size[i-1]+cnt);
            else
                size[i]+=(size[i-1]+cnt++);
                
            flag=!flag;
        }
        System.out.print(size[num-1]);

        scanner.close();
    }
}