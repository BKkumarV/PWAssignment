package recursion;

import java.util.Scanner;

public class CheckArmstrong {

    static int power(int num,int pow)
    {
        int ans=1;
        for(int i=1;i<=pow;i++)
            ans*=num;

        return ans;
    }
    static int sumOfDigitPow(int num,int pow){
        if(num<10)
        {
            return power(num,pow);
        }
        return power((num%10),pow)+sumOfDigitPow(num/10,pow);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check armstrong");
        System.out.print("Input:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //for loop to count number of digit
        int count=0;
        for(int i=num;i>0;i/=10)
            count++;
        if(sumOfDigitPow(num,count)==num)
            System.out.println("Output:Yes");
        else
            System.out.println("Output:NO");
    }
    
}
