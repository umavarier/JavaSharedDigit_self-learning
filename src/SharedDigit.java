//Java program to find the given 2 digit numbers have any shared digit

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] ar)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the first 2 digit number: ");
        int num1= s.nextInt();
        s.nextLine();
        System.out.println("Enter the second @ digit number :");
        int num2 = s.nextInt();
        s.nextLine();
        if(hasSharedDigit(num1,num2))
        {
            System.out.println("The numbers have shared digits");
        }
        else
        {
            System.out.println("The numbers have no shared digit");
        }
    }

    public static boolean hasSharedDigit(int n1, int n2)
    {    int ldn1=0; int ldn2=0;
        if(((n1>=10)&&(n1<=99)) && ((n2>=10)&&(n2<=99)))
        {
            ldn1=n1%10;
            ldn2=n2%10;
            n1=n1/10;
            n2=n2/10;
            if(((n1==n2)||(n1==ldn2))||((n2==ldn1)||(ldn1==ldn2)))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
