package Lec_12;

public class Local_global {

    public static void main(String[] args) {
        add(1,3);
        int t=res+5;
        System.out.println(t);
        return;
    }
    static int res=1;
    public static void add(int a,int b){
        int res=a+b;
        System.out.println(res);
    }
}
