import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int p=scanner.nextInt(), n=scanner.nextInt(), result=0;
        Integer stress[]=new Integer[n];

        for(int i=0;i<n;i++)
            stress[i]=scanner.nextInt();
        
        scanner.close();

        Arrays.sort(stress);

        while(p<200)
        {
            if(stress[0]>200)
                break;
            if(stress[0]<=200)
            {
                p+=stress[0];
                stress[0]=300;
                result++;
            }
            Arrays.sort(stress);
        }
        System.out.print(result);
    }
}