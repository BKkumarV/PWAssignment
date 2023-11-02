package recursion;

import java.util.Scanner;

public class SumOfNatural {
    static int sumOfAlterSign(int num){
        if(num==0)
        {
            return 0;
        }
        if(num%2==0)
        {
            return sumOfAlterSign(num-1)-num;
        }
        return num+sumOfAlterSign(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.print("Output:"+sumOfAlterSign(num));

    }
}
