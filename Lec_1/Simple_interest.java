package Lec_1;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal= sc.nextInt();
        int rate= sc.nextInt();
        int time= sc.nextInt();
        int simple_interest=(principal*rate*time)/100;
        System.out.println(simple_interest);
    }
}
