import java.util.Scanner;
public class p2task1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please enter the Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.print(n+" * "+i+" = "+n*i);
            System.out.println();
        }
    }
}