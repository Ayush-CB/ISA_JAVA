package Lec_3;

public class Pattern_7 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int space=n-2;
        while(row_no<=n){
            if(row_no==1 || row_no==n){
                int star=1;
                while(star<=n){
                    System.out.print("* ");
                    star=star+1;
                }
            }
            else{
                System.out.print("* ");
                int sp=1;
                while (sp<=n-2){
                    System.out.print("  ");
                    sp=sp+1;
                }
                System.out.print("* ");
            }
            System.out.println();
            row_no=row_no+1;

        }
    }
}
