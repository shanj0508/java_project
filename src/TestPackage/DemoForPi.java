package TestPackage;

/*
* 圆周率π可以使用公式计算：
*
* 请利用for循环计算π
* */
public class DemoForPi {
    public static void main(String[] args) {
        double pi=0;
        int flag=1;

        for(int i=1;i<=1000000;i=i+2){
            pi=pi+flag*(1.0/i);
            flag=-flag;
            System.out.println("i:"+i);
            System.out.println("flag:"+flag);
            System.out.println("pi:"+pi);
        }
        pi=pi*4;
        System.out.println("pi:"+pi);
    }
}
