package Lec_5;

import java.util.Scanner;

public class Pattern_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row_no=1;
        int cnt_space=n-1;
        int cnt_num=1;
        while(row_no<=n){
            int space=1;
            while(space<=cnt_space){
                System.out.print("  ");
                space=space+1;
            }
            int num=1;
            while(num<=cnt_num){
                System.out.print(row_no+" ");
                num=num+1;
            }
            System.out.println();
            cnt_space=cnt_space-1;
            cnt_num=cnt_num+2;
            row_no=row_no+1;
        }
    }
}
