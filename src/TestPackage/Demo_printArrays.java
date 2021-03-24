package TestPackage;

import java.util.Arrays;

/*
请按倒序遍历数组并打印每个元素：
* */
public class Demo_printArrays {
    public static void main(String[] args){
        int[] ns={ 1, 4, 9, 16, 25};
        System.out.println("原数组为：");
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(ns));
        System.out.println("--------------------------");
        System.out.println("倒序打印数组：");
        for(int i=ns.length-1;i>=0;i--){
            System.out.printf("数组第%d个元素为:",i);
            System.out.println(ns[i]+",");
        }

    }
}
