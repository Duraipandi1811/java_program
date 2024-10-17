public class findgs
 {
    // public static void main(String[] args)
    //  {
    //     int a[]={10,20,30,40,67};
    //     int min=a[0]; 
    //     int max=a[0];

    //     for(int i=0;i<a.length; i++)
    //     {
    //         if(a[i]>max)
    //         {
    //            max=a[i];
    //         }
    //         if(a[i]<min)
    //         {
    //             min=a[i];
    //         }
    //     }
    //    System.out.println(min);
    //    System.out.println(max);
    // }


    //  Sum of array

    // public static void main(String[] args) 
    // {
    //     int a[]={20,30,45,10,20,60,2};
    //     int sum=0;
    //     for(int i=0; i<a.length; i++)
    //     {
    //        sum=sum+a[i];
    //     }
    //     System.out.println(sum);
    // }



    // sorted array

    public static void main(String[] args)
     {
        int a[]={20,30,45,10,20,60,2};
        int t=0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
             {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
             }
        }
        for(int k=0; k<a.length; k++)
        {
            System.out.println(a[k]);
        }
    }
}



