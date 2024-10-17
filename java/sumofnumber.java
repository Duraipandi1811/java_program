import java .util.Scanner;
public class sumofnumber 
 { 
//     public static void main(String[] args)
//      {
//         System.out.print("Enter your N Number:");
//         Scanner ob =new Scanner(System.in);
//         int n=ob.nextInt();
//         // int sum=0;
//         // for(int i=1 ;i<=n; i++)
//         // {
//         //    sum=sum+i;
//         // }
//         int a=(n*(n+1)/2);
//         System.out.println("Sum of n numbers:"+ a);
//     }
public static void main(String[] args)
    {
         System.out.print("Enter your A Number:");
        Scanner ob =new Scanner(System.in);
        int a=ob.nextInt();
        System.out.print("Enter your B Number:");
        int b= ob.nextInt();
        int sum =b*(b+1)/2-a*(a+1)/2 +a;
        // int sum=0;
        // for (int i=a; i<=b; i++)
        // {
        //       sum=sum+i;
        // }
        System.out.println(sum);
}
 }
