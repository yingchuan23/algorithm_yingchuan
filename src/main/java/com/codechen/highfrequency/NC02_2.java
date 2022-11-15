package com.codechen.highfrequency;

public class NC02_2 {


    public int[] MySort (int[] arr) {
        // write code here
        quicksort(arr,0,arr.length - 1);

        return arr;
    }

    public void quicksort(int[] arr ,int L,int R){

        if(L>R){
            return ;

        }
        int left = L;
        int right = R;
        int pivot = arr[left];
        while(left < right){
            while(left < right && arr[right] >= pivot){
                right --;
            }
            if(left < right){
                arr[left] = arr[right];
            }
            while(left < right && arr[left] <= pivot){
                left++;
            }
            if(left < right){
                arr[right] = arr[left];
            }
            if(left >= right){
                arr[left] = pivot;
            }

        }
        quicksort(arr,L,right - 1);
        quicksort(arr,right + 1,R);

    }

}
