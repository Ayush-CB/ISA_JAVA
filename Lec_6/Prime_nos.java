package Lec_6;

import java.util.Scanner;

public class Prime_nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
