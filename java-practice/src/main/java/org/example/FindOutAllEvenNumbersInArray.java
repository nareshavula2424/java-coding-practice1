package org.example;

public class FindOutAllEvenNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 6, 6, 443, 67, 89, 12, 56, 78, 45, 78, 22, 11, 33, 44, 90};
//        int[] arr1 = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arr1[i] = arr[i];
//                arr[i]++;
//
//            }
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            if(arr1[i]!=0)
//            System.out.print(arr1[i] + " ");
//        }
// find out common elements

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
            if(arr[i] == arr[j]) {
                System.out.print(arr[i]+" ");
                break;
            }

            }
        }
    }
}
