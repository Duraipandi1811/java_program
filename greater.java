public class greater
 {
    // public static void main(String[] args) 
    // {
    //     int a=30;
    //     int b=40;
    //     if(a>b)
    //     {
    //         System.out.println("A is the greatest number");
    //     }
    //     else {
    //         System.out.println("b is the greatest number");
    //     }
    // }


    public static void main(String[] args) 
    {
        int a=10;
        int b=20;
        int c=445;

        if(a>=b && a>=c)
        {
            System.out.println(a+"A is greatest number");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b+"B is greatest number");
        }
        else
        {
            System.out.println(c+"is greatest number");
        }
    }
    
}
