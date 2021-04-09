package com.github.shanj.strbuilderdemo;

public class StringBuilder1 {
    public static void main(String[] args){
        //for循环直接拼接字符串
        String s = "";
        for (int i = 0; i < 10; i++) {
            s = s + "," + i;
            System.out.println(s);
        }
        //StringBuilder
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb.append(',');
            sb.append(i);
            // 支持链式操作：
            //sb.append(',').append(i);
        }
        String s1 = sb.toString();
        System.out.println("s1：");
        System.out.println(s1);

    }
}
