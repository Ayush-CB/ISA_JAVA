package Lec_14;

public class Reverse_range {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        reverse(arr,3,6);
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
        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
