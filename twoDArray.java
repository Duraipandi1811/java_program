import java.util.*;
public class twoDArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row in Array:");
        int n=sc.nextInt();
        System.out.println("Enter the number of column in Array:");
        int m=sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int choice;
        do{
            System.out.println("\n*** Menu ***");
            System.out.println("1. Print Array");
            System.out.println("2. Diagonal Sums");
            System.out.println("3. Change Print Order (Wave Pattern)");
            System.out.println("4. Boundary Elements");
            System.out.println("5. Maximum Value in Each Row");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice) 
            {
                case 1:
                    printArray(n, m, arr);
                    break;
                case 2:
                    Diagonal(n, m, arr);
                    break;
                case 3:
                    change_print_order(n, m, arr);
                    break;
                case 4:
                    boundryarray(n, m, arr);
                    break;
                case 5:
                    maxValue(n, m, arr);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=6);
    }
    public static void Diagonal(int n,int m,int arr[][]) 
    {
        int count=0,count2=0;
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++) 
            {
                if(i==j) 
                {
                    count+=arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
                if((i+j)==n-1) 
                {
                    count2 += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Main Diagonal: " + count);
        System.out.println("Second Diagonal: " + count2);
    }

    public static void printArray(int n, int m, int arr[][]) 
    {
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void change_print_order(int n, int m, int arr[][]) 
    {
        for(int i=0;i<n;i++) 
        {
            if(i%2==0) 
            {
                for(int j=0;j<n;j++) 
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } 
            else
            {
                for(int j=n-1;j>=0;j--) 
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void boundryarray(int n,int m,int arr[][]) 
    {
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++) 
            {
                if ((i==0||i==n-1) || (j==0||j==m-1)) 
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
    public static void maxValue(int n,int m,int arr[][]) 
    {
        for(int i=0;i<n;i++) 
        {
            int max=0;
            for(int j=0;j<m;j++) 
            {
                if(arr[i][j]>max) 
                {
                    max=arr[i][j];
                }
            }
            System.out.println("Max Value in row "+i+": "+max);
        }
    }
}
