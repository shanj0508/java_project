package TestPackage;

public class Demo_doWhile {
    public static void main(String[] args) {
        int sum = 0;
        int n = 20;
        int m=100;
        do {
            sum = sum + n;
            n++;
        } while (n <= m);
        System.out.println("sum:"+sum);
    }
}
