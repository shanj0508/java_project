package TestPackage;

public class DemoWhile {
    public static void main(String[] args) {
        int m = 20;
        int n=100;
        int sum = 0;
        while (m <= n) {
            sum = sum + m;
            m++;
        }
        System.out.println("1到100的和为：" + sum);
    }
}
