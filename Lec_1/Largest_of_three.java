package Lec_1;

import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A "+a);
        }
        else if(b>a && b>c){
            System.out.println("B "+b);
        }
        else{
            System.out.println("C "+c);
        }
    }
}
