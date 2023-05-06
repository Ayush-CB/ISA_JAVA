package Lec_2;

public class Pattern_6 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int cnt_space=0;
        int cnt_star=n;
        while(row_no<=n){
            int space=1;
            while(space<=cnt_space){
                System.out.print("  ");
                space=space+1;
            }
            int star=1;
            while (star<=cnt_star){
                System.out.print("* ");
                star=star+1;
            }
            System.out.println();
            cnt_space=cnt_space+2;
            cnt_star=cnt_star-1;
            row_no=row_no+1;
        }
    }
}
