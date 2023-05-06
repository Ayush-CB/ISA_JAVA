package Lec_1;

public class Largest_of_three_nos {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        int c=3;

        if(a>b && a>c){
            System.out.println("A");
        }
        else if(b>a && b>c){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}
