import java.util.Scanner;
public class p2task2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please enter the marks obtained by Student: ");
        float m=sc.nextFloat();
        System.out.print(" Total marks: ");
        float n=sc.nextFloat();
        float per=(float)((m/n)*100);
        System.out.format("Percentage: %.2f",per);
        System.out.print("%");
        System.out.println();
        if(per<=59)
        {
            System.out.println("Grade F" +" , "+"GPA=0.0");
        }
        else if(per>=60 && per<=69)
        {
            System.out.println("Grade D" +" , "+"GPA=1.0");
        }
        else if(per>=70 && per<=79)
        {
            System.out.println("Grade C" +" , "+"GPA=2.0");
        }
        else if(per>=80 && per<=89)
        {
            System.out.println("Grade B" +" , "+"GPA=3.0");
        }
        else
        {
            System.out.println("Grade A" +" , "+"GPA=4.0");
        }
    }
}