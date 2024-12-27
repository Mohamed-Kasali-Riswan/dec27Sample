import java.util.*;
class demo{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {

        //Printing stars patterns

        //      * 
        //     * * 
        //    * * * 
        //   * * * * 
        //  * * * * *

        System.out.println("Enter the value for Pyramid : ");
        int n=sc.nextInt();
        int space=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=space;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }



        // for(int i=1;i<11;i++)
        // {
        //     System.out.println(i);
        // }

        // //Sum of N values
        // int sum=0;
        // for(int i=0;i<11;i++)
        // {
        //     sum+=i;
        // }
        // System.out.println("The sum is "+sum);

        // //Tables 
        // System.out.println("Enter the value for tables : ");
        // int t=sc.nextInt();
        // for(int i=1;i<21;i++)
        // {
        //     System.out.println(t+"x"+i+"="+t*i);
        // }

        // //Reversing the number
        // System.out.println("Enter the number for reversing : ");
        // int og=sc.nextInt();
        // int rev=0;

        // while(og>0)
        // {
        //     rev=(rev*10)+(og%10);
        //     og/=10;
        // }
        // System.out.println("Reverse value is "+rev);

        // //Prime Number or Not
        // System.out.println("Enter the number to check for prime : ");
        // int pp=sc.nextInt();
        // boolean isPrime=true;
        // for(int i=2;i<pp;i++)
        // {
        //     if(pp%i==0)
        //         isPrime=false;
        // }
        // if(isPrime) System.out.println("Yes it is Prime");
        // else System.out.println("No it is not a Prime");

        // //Fibonacci

        // System.out.println("Enter the number for fibonacci series : ");
        // int fi=sc.nextInt();
        // int n1=0,n2=1;
        // System.out.print(n1+" "+n2);
        // for(int i=0;i<fi-2;i++)
        // {
        //     int n3=n1+n2;
        //     System.out.print(" "+n3);
        //     n1=n2;
        //     n2=n3;
        // }


        // //Factorial
        // System.out.println("Enter the number for factorial : ");
        // int fa=sc.nextInt();
        // int pro=1;
        // for(int i=1;i<=fa;i++)
        // {
        //     pro*=i;
        // }
        // System.out.println("The Factorial is "+pro);
    }
}