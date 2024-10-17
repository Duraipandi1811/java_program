import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int a=ob.nextInt();
        int x[]=new int [a];   
        System.out.println("Enter the values :");
        for(int i=0; i<a; i++)
        {
            x[i]=ob.nextInt();
        }
        int min=x[0];
        for(int i=0; i<a; i++)
        {
            if(x[i]<min)     // x[i]>max
            
            {
                min=x[i];     // max=x[i]
            } 
        }
        System.out.println(min);     // print max
        int min1=x[1];
        for(int i=1; i<a; i++)
        {
            if(x[i]<min1)     // x[i]>max
            {
                min1=x[i];     // max=x[i]
            } 
        }
        System.out.println(min1);     
    }
    
}