import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        int test=scanner.nextInt(), index=0, result=0, max=-1;
        Pokemon pokemon[]=new Pokemon[test];
        
        for(int t=0;t<test;t++)
        {
            String name=scanner.next();
            int need=scanner.nextInt(), hava=scanner.nextInt();

            pokemon[t]=new Pokemon(name, need, hava);
            int evolution=pokemon[t].get_evolution();

            if(max<evolution)
            {
                index=t;
                max=evolution;
            }
            result+=evolution;
        }
        
        System.out.println(result);
        System.out.println(pokemon[index].name);

        scanner.close();
    }
}

class Pokemon
{
    String name;
    int candy_need, candy_have;

    public Pokemon(String name, int candy_need, int candy_have)
    {
        this.name=name;
        this.candy_need=candy_need;
        this.candy_have=candy_have;
    }
    public int get_evolution()
    {
        int evolution=0;

        while(candy_have>=candy_need)
        {
            candy_have-=candy_need;
            evolution++;
            candy_have+=2;
        }
        return evolution;
    }
}