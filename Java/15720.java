import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);

        int burger=scanner.nextInt(), side=scanner.nextInt(), beverage=scanner.nextInt();
        int discount=0;

        ArrayList<Integer> burger_list=new ArrayList<>(burger);
        ArrayList<Integer> side_list=new ArrayList<>(side);
        ArrayList<Integer> beverage_list=new ArrayList<>(beverage);

        for(int i=0;i<burger;i++)
            burger_list.add(Integer.valueOf(scanner.nextInt()));
        for(int i=0;i<side;i++)
            side_list.add(Integer.valueOf(scanner.nextInt()));
        for(int i=0;i<beverage;i++)
            beverage_list.add(Integer.valueOf(scanner.nextInt()));
        
        Collections.sort(burger_list,Collections.reverseOrder());
        Collections.sort(side_list,Collections.reverseOrder());
        Collections.sort(beverage_list,Collections.reverseOrder());

        System.out.println(sum(burger_list)+sum(side_list)+sum(beverage_list));

        for(int i=0;i<min(burger,side,beverage);i++)
        {
            if(!burger_list.isEmpty()&&!side_list.isEmpty()&&!beverage_list.isEmpty())
            {
                discount+=0.9*(burger_list.get(0)+side_list.get(0)+beverage_list.get(0));
            
                burger_list.remove(0);
                side_list.remove(0);
                beverage_list.remove(0);
            }
        }
        discount+=sum(burger_list)+sum(side_list)+sum(beverage_list);

        System.out.println(discount);

        scanner.close();
    }
    static int sum(ArrayList<Integer> arr)
    {
        int result=0;

        for(int i=0;i<arr.size();i++)
            result+=arr.get(i);

        return result;
    }
    static int min(int a, int b, int c)
    {
        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else
            return c;
    }
}