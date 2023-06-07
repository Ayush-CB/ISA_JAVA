package Lec_15;

public class Linear_search {
    public static void main(String[] args) {
        int arr[]={3,1,4,7,6,2,5};
        int target=6;
        linear(arr,target);
    }
    public static void linear(int arr[],int target){
        int ans=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
