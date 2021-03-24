package TestPackage;

import java.util.Arrays;

public class Demo_sortArrays {
    public static void main(String[] args){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        //排序前：
        System.out.println(Arrays.toString(ns));
        //冒泡排序：两个for的条件？？？
//        for (int i = 0; i < ns.length - 1; i++) {
//            for (int j = 0; j < ns.length - i - 1; j++) {
//                if (ns[j] > ns[j+1]) {
//                    // 交换ns[j]和ns[j+1]:
//                    int tmp = ns[j];
//                    ns[j] = ns[j+1];
//                    ns[j+1] = tmp;
//                }
//            }
//        }
        Arrays.sort(ns);
        // 降序排序??
        //排序后：
        System.out.println(Arrays.toString(ns));
    }
}
