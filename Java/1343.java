import java.util.Scanner;

public class Main
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        String test=scanner.next();
        scanner.close();

        String A="AAAA";
        String B="BB";
        String result="";

        result=test.replaceAll("XXXX", A);
        result=result.replaceAll("XX", B);

        if(result.contains("X"))
            System.out.print("-1");
        else
            System.out.print(result);
    }
}