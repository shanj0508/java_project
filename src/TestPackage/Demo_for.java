package TestPackage;

/*
 *给定一个数组，请用for循环倒序输出每一个元素
 */

public class Demo_for {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = 0; i < ns.length; i++) {
            System.out.printf("当前循环的数组元素是第%d个,值为%d\n",i,ns[i]);
        }

    }
}
