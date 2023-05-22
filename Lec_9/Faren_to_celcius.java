package Lec_9;

import java.util.Scanner;

public class Faren_to_celcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
        int step= sc.nextInt();
        for(int i=start;i<=end;i=i+step){
            int c=(5*(i-32))/9;
            System.out.println(i+"===>"+c);
        }
    }
}
