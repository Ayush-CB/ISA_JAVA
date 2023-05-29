package Lec_12;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rev=reverse(n);
        if(n==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
    public static int reverse(int n){
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return ans;
    }
}
