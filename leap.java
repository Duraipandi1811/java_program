public class leap
 {
    public static void main(String[] args)
     {
       int n=2003;
       if(n%400==0 || (n%4==0 && n%100 !=0))
       {
        System.out.println(n + "Its leap year");
       }
       else{
        System.out.println("Its is not Leap year");
       }

    }
    
}
