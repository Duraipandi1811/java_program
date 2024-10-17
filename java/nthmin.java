import java.util.Scanner;

public class nthmin
 {
    public static void main(String[] args)
     {
        System.out.println("Enter the Array Size:");
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0; i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("Enter the n term value:");
        int x=ob.nextInt();
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
             if(a[i]<min)
             {
                
             }
        }
    }
    
}
