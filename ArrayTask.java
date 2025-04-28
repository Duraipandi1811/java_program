import java.util.*;
public class ArrayTask 
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Array size:");
	    int n=sc.nextInt();
	    System.out.println("Enter the Array values:");
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter Your choice \n 1.Secondlargestnumber \n 2.SwappingArray \n 3.SortedArray");
	    int ch=sc.nextInt();
	    switch(ch)
	    {
	        case 1:
    	        {
    	           int result=Secondlargestnumber(n,arr);
    	           System.out.println("The Secondlargest Number is "+result);
    	           break;
    	        }
	        case 2:
    	        {
    	            System.out.println("SwappingArray");
    	            swappingArray(arr);
    	            printArray(arr);
    	            break;
    	        }
	        case 3:
	            {
	                System.out.println("Sorted Array");
	                sortedArray(n,arr);
            	    printArray(arr);
            	    break;
	            }
	       default :
	       {
	           System.out.println("Invalid Choice");
	       }
	    }
	}
	public static int Secondlargestnumber(int n,int arr[])
	{
	    int max=arr[0];
	    int max2=Integer.MIN_VALUE;
	    for(int i=0; i<n; i++)
	    {
	        if(arr[i]>max)
	        {
	            max=arr[i];
	        }
	    }
	    for(int i=0; i<n; i++)
	    {
	        if(arr[i]<max && arr[i]>max2)
	        {
	            max2=arr[i];
	        }
	    }
	    return max2;
	}
	public static void sortedArray(int n,int arr[])
	{
	    for(int i=0; i<n; i++)
	    {
	        for(int j=i+1; j<n; j++)
	        {
	            if(arr[i]>arr[j])
	            {
	                int temp=arr[i];
    	            arr[i]=arr[j];
    	            arr[j]=temp;
	            }
	        }
	    }
	}
	public static void printArray(int arr[])
	{
	    for(int i: arr)
	    {
	        System.out.print(i+" ");
	    }
	}
	public static void swappingArray(int arr[])
	{
	    int left=0;
	    int right=arr.length-1;
	    while(left<right)
	    {
	        int temp=arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	        left++;
	        right--;
	    }
	}    
}
