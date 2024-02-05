import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int test=scanner.nextInt(),result=0;
        Integer candidate[]=new Integer[test];

        for(int i=0;i<test;i++)
            candidate[i]=scanner.nextInt();
        
        int dasom=candidate[0];
        candidate[0]=-1;

        Arrays.sort(candidate,Collections.reverseOrder());

        while(dasom<=candidate[0])
        {
            result++;
            dasom++;
            candidate[0]--;
            Arrays.sort(candidate,Collections.reverseOrder());
        }
        System.out.print(result);
    }
}