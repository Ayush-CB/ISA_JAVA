package Lec_12;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=count_digits(n);
        armstrong(n,count);
    }
    public static int count_digits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void armstrong(int num,int count){
        int ans=0;
        int backup=num;
        while(num!=0){
            int dig=num%10;
            ans=ans+(int)Math.pow(dig,count);
            num=num/10;
        }
        System.out.println(backup==ans);
    }
}
