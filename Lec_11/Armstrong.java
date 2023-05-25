package Lec_11;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=no_of_digits(n);
        System.out.println(armstrong(n,count));
    }
    public static int no_of_digits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean armstrong(int num,int count){
        int ans=0;
        int backup=num;
        while(num!=0){
            int digit=num%10;
            ans=ans+(int)Math.pow(digit,count);
            num=num/10;
        }
        return backup==ans;
    }
}
