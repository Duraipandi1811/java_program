import java.util.*;

public class fact 
{  
    public static void main(String[] args) 
    {
        Scanner ob =new Scanner(System.in);
        int n=ob.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    
}
