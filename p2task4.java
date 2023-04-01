import java.util.Scanner;
public class p2task4{
    public static void eodd(int a)
    {
        if(a%2==0)
            System.out.println(a+" is a EVEN number");
        else
            System.out.println(a+" is a ODD number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu based app- Even/Odd checker ");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();
        eodd(n);
        System.out.print("Do you want to continue: ");
        System.out.println();
        char c=sc.nextLine().charAt(0);
        if(c=='y'){eodd(n);}
    }
}