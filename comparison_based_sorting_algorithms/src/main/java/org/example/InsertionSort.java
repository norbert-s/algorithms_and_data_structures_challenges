package org.example;

public class InsertionSort {
    public static void main(String[]args){
        int [] tomb = { 4,1,3,2,4,1-2,100,-3,-10,22};
        //insertionSort(tomb);
        //insertionSortImpl(tomb);
        insertionSortPractice(tomb);
        for(int i : tomb){
            System.out.println(i);
        }

    }


    static void insertionSortPractice(int arr[]){
        for(int unsortedIndex=1;unsortedIndex< arr.length;unsortedIndex++){
            int newItem = arr [unsortedIndex];
            int i ;
            for (i=unsortedIndex;i>0&&arr[i-1]>newItem;i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newItem;
        }
    }





























    public static void insertionSortImpl(int[] arr){
        for(int unsortedIndex = 1;unsortedIndex<arr.length;unsortedIndex++ ){
            int newItem = arr[unsortedIndex];
            int i;
            for(i=unsortedIndex;i>0&&arr[i-1]>newItem;i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newItem;
        }
    }

    //this implementation comes from buchalka insertion sort
    public static void insertionSort(int[] arr) {
        for(int unsortedIndex=1;unsortedIndex<arr.length;unsortedIndex++){

            int newElement = arr[unsortedIndex];
            int j;
            for( j=unsortedIndex;j>0&&arr[j-1]>newElement;j--){
                    arr[j]=arr[j-1];
            }
            arr[j] = newElement;
        }
    }
}
