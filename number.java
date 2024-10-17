public class number
 {
    //  public static void main(String a[])
    //  { 
    //     int num = 20;
    // if (num > 0)
    //     System.out.println ("The number is positive");
    // else if (num < 0)
    //     System.out.println ("The number is negative");
    // else
    //     System.out.println ("Zero");

    //  }

    //  public static void main(String[] args) 
    //  {
    //     int  num=-1;
    //     if(num>=0)
    //     {
    //         if(num==0)
    //         {
    //             System.out.println("It's equal to zero");
    //         }
    //         else
    //         {
    //             System.out.println("It's positive number");
    //         }
    //     }
    //     else
    //     {
    //         System.out.println("It's negative number");
    //     }
    //  }
    public static void main(String[] args) 
    {
        int num=0;
        if(num==0)
        {
            System.out.println("it's Zero");
        }
        else
        {
            String answer= num >0 ? "Its Positive Number":"Its negative Number";
            System.out.println(answer);
        }
    }

    
}
