package Lec_14;

public class Min_in_array {
    public static void main(String[] args) {
        int arr[]={10,5,3,-2,6,11,-10};
        min(arr);
    }
    public static void min(int arr[]){
        int minel=arr[0];
        for(int i=1;i< arr.length;i++){
            minel=Math.min(minel,arr[i]);
        }
        System.out.println(minel);
    }
}
