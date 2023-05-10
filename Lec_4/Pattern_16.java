package Lec_4;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row_no=1;
        int cnt_space=n-1;
        int cnt_star=n;
        while(row_no<=(2*n-1)){
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
            if(row_no<n){
                cnt_star=cnt_star-1;
                cnt_space=cnt_space-1;
            }
            else{
                cnt_star=cnt_star+1;
                cnt_space=cnt_space+1;
            }
            System.out.println();
            row_no=row_no+1;
        }
    }
}
