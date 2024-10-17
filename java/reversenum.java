import java.util.Scanner;

public class reversenum 
{
    public static void main(String[] args) 
    {   
        System.out.println("Enter the Number:");
        Scanner ob=new Scanner(System.in);
        int number=ob.nextInt();
        int reverse_num=0;
        while(number!=0)
        {
            reverse_num=reverse_num*10+number%10;
            number=number/10;
        }
        System.out.println( "Reversed number:"+reverse_num);
    }
}
