public class first {
    public static void main(String[] args) 
    {
        int x=23534;
        int count=0; 
        while (x!=0) 
        {
               int t=x%10;
               System.out.println(t);
               count=count+1;
               x=x/10; 
        }System.out.println(count);
    }
}
