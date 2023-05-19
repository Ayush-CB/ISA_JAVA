package Lec_8;

import java.util.Scanner;

public class Any_to_any_base {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int src= sc.nextInt();
        int dest= sc.nextInt();
        int ans=0;
        int mult=1;
        while(n!=0){
            int rem=n%dest;
            ans=ans+(mult*rem);
            mult=mult*src;
            n=n/dest;
        }
        System.out.println(ans);
    }
}
