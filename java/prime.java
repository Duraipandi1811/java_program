import java.util.*;

public class prime
 {
    public static void main(String[] args)
    {
        System.out.println("Ente the number:");
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int t=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                t=t+1;
            }
        }
        if(t==2)
        {
            System.out.println(t+"Its prime number");
        }
        else{
            System.out.println(t +"It i not prime number");
        }
    }
}
