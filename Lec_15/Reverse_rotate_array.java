package Lec_15;

public class Reverse_rotate_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=4;
        k=k% arr.length;
        display(arr);
        //CASE 1
        reverse(arr,0, arr.length-k-1);
        //CASE 2
        reverse(arr, arr.length-k, arr.length-1 );
        //CASE 3
        reverse(arr,0, arr.length-1);
        display(arr);
    }
    public static void display(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int arr[],int i,int j){
        int start=i;
        int end=j;
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
//        for(int k=0;k< arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
    }
}
