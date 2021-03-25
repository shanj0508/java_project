package TestPackage;

public class Demo_sortHalfSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 12, 19, 27, 33, 40, 52, 68, 79, 88, 91, 100};
        System.out.println(halfSearch(arr, 0, arr.length - 1, 52));

    }

    /**
     * 二分查找-递归实现
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
}
