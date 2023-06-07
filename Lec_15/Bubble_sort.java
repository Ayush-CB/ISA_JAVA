package Lec_15;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={7,6,5,4,3,2};
        bubble(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble(int arr[]){
        for(int turn=1;turn< arr.length;turn++){
            for(int i=0;i< arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}
