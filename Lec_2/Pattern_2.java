package Lec_2;

public class Pattern_2 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int cnt_star=1;
        while(row_no<=n){
            int star=1;
            while(star<=cnt_star){
                System.out.print("* ");
                star=star+1;
            }
//            System.out.println(star);
            System.out.println();
            cnt_star=cnt_star+1;
            row_no=row_no+1;

        }
    }
}
