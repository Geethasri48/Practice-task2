import java.util.Scanner;
public class p2task8{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please enter the Number A: ");
        int A=sc.nextInt();
        System.out.print(" Please enter the Number B: ");
        int B=sc.nextInt();
        System.out.print(" Please enter the Number C: ");
        int C=sc.nextInt();

        if(A<=B && A<=C)System.out.print("The Smallest Number: "+A);
        else if(B<=A && B<=C)System.out.print("The Smallest Number: "+B);
        else System.out.print("The Smallest Number: "+C);
        System.out.println();

        if(A>=B && A>=C)System.out.print("The Largest Number: "+A);
        else if(B>=A && B>=C)System.out.print("The Largest Number: "+B);
        else System.out.print("The Largest Number: "+C);
        System.out.println();

        System.out.println("Average of all the three Numbers: "+((A+B+C)/3));
    }
}