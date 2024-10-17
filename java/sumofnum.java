import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) 
    { 
        System.out.print("Enter your Number:");
        Scanner ob= new Scanner(System.in);
        int Number=ob.nextInt();
        int sum=0;
        while (Number!=0)
         {
              sum=sum+Number%10;
              Number=Number/10;
        }
        System.out.println(sum);

    }
}
