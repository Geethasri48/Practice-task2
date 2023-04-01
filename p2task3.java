import java.util.Scanner;
public class p2task3{
    public static void swap(int a,int b)
    {
        int c=a;
        a=b;
        b=c;
        System.out.println("numA:"+a);
        System.out.println("numB: "+b);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please enter the Number A: ");
        int numA=sc.nextInt();
        System.out.print(" Please enter the Number B: ");
        int numB=sc.nextInt();
        swap(numA,numB);
    }
}