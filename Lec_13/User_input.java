package Lec_13;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[5];
        int arr1[]=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        display(arr);
    }
    public static void display(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
