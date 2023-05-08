package Lec_3;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row_no=1;
        int cnt_space=n-1;
        int cnt_star=1;
        while (row_no<=n){
            int space=1;
            while(space<=cnt_space){
                System.out.print("  ");
                space=space+1;
            }
            int star=1;
            while(star<=cnt_star){
                System.out.print("* ");
                star=star+1;
            }
            System.out.println();
            cnt_space=cnt_space-1;
            cnt_star=cnt_star+2;
            row_no=row_no+1;
        }
    }
}
