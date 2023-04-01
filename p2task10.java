import java.util.Scanner;
import java.util.*;
public class p2task10{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the StringName: ");
        String str=sc.nextLine();
        System.out.print("Enter the Starting index: ");
        int sin=sc.nextInt();
        System.out.print("Enter the Ending index: ");
        int ein=sc.nextInt();
        String s="";
        for(int i=sin;i<=ein;i++)
        {
            s+=str.charAt(i);
        }
        System.out.println("Substring of "+str+" from "+sin+" to "+" is: "+s);
    }
}