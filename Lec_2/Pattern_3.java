package Lec_2;

public class Pattern_3 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int cnt_star=n;
        while(row_no<=n){
            int star=1;
            while(star<=cnt_star){
                System.out.print("* ");
                star++;
            }
            System.out.println();
            cnt_star=cnt_star-1;
            row_no=row_no+1;
        }
    }
}
