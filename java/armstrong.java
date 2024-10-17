import java.util.*;
public class armstrong 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Your number:");
        Scanner ob=new Scanner(System.in);     //string .valueof(num).len
        int num=ob.nextInt();
        int rem,sum=0;
        int number=num;
        int start=1,end=100;
        for(int i=start;i<=end;i++)
         {
            rem=number%10;
            sum=sum+rem*rem*rem; //  math.pow(rem,len)
            number=number/10;
        }
        if(sum==num)
        {
            System.err.println("Its Armsrtong Number");
        }
        else{
            System.out.println("Its Not a Armstrong number");
        }
    }
}