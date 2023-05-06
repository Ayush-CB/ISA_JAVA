package Lec_2;

public class Pattern_1 {
    public static void main(String[] args) {
        int n=6;
        int row_no=1;
        while(row_no<=n){
            int star=1;
            while(star<=n){
                System.out.print("* ");
                star=star+1;
            }
            System.out.println();
            row_no=row_no+1;
        }
    }
}
