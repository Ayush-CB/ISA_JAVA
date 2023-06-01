package Lec_13;

public class Swap_array2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int brr[]={6,7,8,9,0};
        System.out.println(arr[0]+"------->"+brr[0]);
        swap(arr,brr);
        System.out.println(arr[0]+"------->"+brr[0]);
    }
    public static void swap(int arr[],int brr[]){
        int temp[]=arr;
        arr=brr;
        brr=temp;
    }
}
