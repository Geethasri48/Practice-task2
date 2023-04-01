import java.util.Scanner;
import java.util.*;
public class p2task9{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please enter the Number: ");
        int num=sc.nextInt();
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)c++;
        }
        if(c==0)System.out.println("The given number is a Prime Number");
        else System.out.println("The given number is NOT a Prime Number");
    }
}