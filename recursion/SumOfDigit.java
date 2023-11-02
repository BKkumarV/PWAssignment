package recursion;

import java.util.*;
/**
 * SumOfDigit
 */
public class SumOfDigit {

    static int digitSum(int num){
        if(num<10){
            return num;
        }
        return num%10+digitSum(num/10);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.println("sum of digit of entered number:"+digitSum(num));
    }
}