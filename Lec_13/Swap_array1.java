package Lec_13;

public class Swap_array1 {
    public static void main(String[] args) {
        int a=5;
        int b=3;
//        a=b;
//        b=a;
        int arr[]={1,2,3,4,5};
        System.out.println(arr[0]+"---->"+arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0]+"---->"+arr[1]);
//        System.out.println(a);
//        System.out.println(b);
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
