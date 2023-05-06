package Lec_1;

import java.util.Scanner;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int no=5;
        int i=1;
        int sum=0;
        while(i<=n){
            System.out.println(i);
            sum=sum+i;
            i=i+1;
        }
        System.out.println(sum);
    }
}
