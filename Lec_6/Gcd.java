package Lec_6;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int divisor=a;
        int dividend=b;
        int remainder=-1;
        while(remainder!=0){
            remainder=dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        System.out.println(dividend);
    }
}
