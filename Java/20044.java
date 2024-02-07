import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int test=2*scanner.nextInt(), result=2147483647;
        int team[]=new int[test];

        for(int i=0;i<test;i++)
            team[i]=scanner.nextInt();
        
        Arrays.sort(team);

        for(int i=0;i<test/2;i++)
            result=Math.min(result,(team[i]+team[test-i-1]));
        
        System.out.print(result);
        
        scanner.close();
    }
}