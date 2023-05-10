package Lec_4;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row_no=1;
        int cnt_star=1;
        while(row_no<=(2*n-1)){
            int star=1;
            while(star<=cnt_star){
                System.out.print("* ");
                star=star+1;
            }
            System.out.println();
            if(row_no<n) {
                cnt_star = cnt_star + 1;
            }
            else{
                cnt_star=cnt_star-1;
            }
            row_no=row_no+1;
        }
    }
}
