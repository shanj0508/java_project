package com.github.shanj;

public class DemoSortHalfSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 12, 19, 27, 33, 40, 52, 68, 79, 88, 91, 100};
        //递归实现
        System.out.println(halfSearch(arr, 0, arr.length - 1, 52));
        //常规方式
        System.out.println(find(arr,9));

    }

    /**
     * 二分查找,返回索引-递归实现
     */
    public static int halfSearch(int[] arr, int low, int hight, int target) {
        if (low <= hight) {
            int mid = (low + hight) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target <= arr[mid]) {
                return halfSearch(arr, low, mid - 1, target);
            } else {
                return halfSearch(arr, mid + 1, hight, target);
            }
        } else {
            return -1;
        }
    }
    /**
     * TODO:二分查找,返回索引-常规实现
     */

    private static int find(int [] arr,int searchKey){
        int lowerBound = 0;
        int upperBound = arr.length -1;
        int curIn;
        while(lowerBound <= upperBound){
            curIn = (lowerBound + upperBound) / 2;
            if(arr[curIn] == searchKey){
                return curIn;
            }else{
                if(arr[curIn] < searchKey){
                    lowerBound = curIn + 1;
                }else{
                    upperBound = curIn - 1;
                }
            }
        }
        return -1;

    }
}
