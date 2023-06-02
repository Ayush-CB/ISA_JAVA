package Lec_14;

public class Reverse_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
//        reverse(arr);
        reverse2(arr);
    }
    public static void reverse(int arr[]){
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
//        System.out.println();
    }
    public static void reverse2(int arr[]){
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
//        for(int a=0,b= arr.length-1;a<=b;a++,b--){
//            int temp=arr[a];
//            arr[a]=arr[b];
//            arr[b]=temp;
//        }
    }
}
