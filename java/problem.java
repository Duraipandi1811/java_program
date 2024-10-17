import java.util.Scanner;

public class problem
{
    // public static void main(String[] args)
    //  {
    //     Scanner ob =new Scanner(System.in);
    //     int a= ob.nextInt();
    //     System.out.println(a+"number");
    // }

    // public static void main(String[] args)
    // {
    //     Scanner ob =new Scanner(System.in);
    //     String name=ob.nextLine();
    //     int age =ob.nextInt();

    //     System.out.println("hi");

    //     System.out.println(" Name:" +name  );
    //     System.out.println("Age:"+ age);
    // }

    // public static void main(String[] args)
    //  {
    //     Scanner ob =new Scanner(System.in);
    //     int a=ob.nextInt();
    //     int b=ob.nextInt();
    //     int c=ob.nextInt();
    //     int d=a*b*c;
    //     int e=a+b+c;
    //     int total=d/e;

    //     System.out.println(total);
    // }

    public static void main(String[] args)
     {
        Scanner ob =new Scanner(System.in);
        String name=ob.nextLine();
        double score =ob.nextDouble();
        double total=score/10;
        ob.nextLine();
        String department= ob.nextLine();

        System.out.println(name);
        System.out.println(total);
        System.out.println(department);

     }
}