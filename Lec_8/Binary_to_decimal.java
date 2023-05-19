package Lec_8;

import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;
        int mult=1;
        while(n!=0){
            int rem=n%10;
            ans=ans+(mult*rem);
            n=n/10;
            mult=mult*2;
        }
        System.out.println(ans);
    }
}
