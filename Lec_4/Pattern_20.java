package Lec_4;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row_no=1;
        int left_spaces=n/2;
        int middle_spaces=-1;
        while(row_no<=n){
            if(row_no==1 || row_no==n){
                int space=1;
                while(space<=(n/2)){
                    System.out.print("  ");
                    space=space+1;
                }
                System.out.print("* ");
            }
            else{
                int left=1;
                while(left<=left_spaces){
                    System.out.print("  ");
                    left=left+1;
                }
                System.out.print("* ");
                int middle=1;
                while(middle<=middle_spaces){
                    System.out.print("  ");
                    middle=middle+1;
                }
                System.out.print("* ");
            }
            System.out.println();
            if(row_no<n/2+1){
                middle_spaces=middle_spaces+2;
                left_spaces=left_spaces-1;
            }
            else{
                middle_spaces=middle_spaces-2;
                left_spaces=left_spaces+1;
            }
            row_no=row_no+1;
        }
    }
}
