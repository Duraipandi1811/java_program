public class arrayaop
 {
    public static void main(String[] args) 
    {
        int a[]={10,20,31,40,50,81,40};
         int sum=0;  
        for(int i=0; i<a.length; i++)
        {
           if(a[i]%2==0)
           {
            System.out.println("it even number"+ a[i]);
           } 
           else
           {
            System.out.println("It odd number" + a[i]);
           }
        }
        System.out.println(sum);

    }
}
