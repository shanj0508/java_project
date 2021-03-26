package com.github.shanj.objcity;

/*
* 请定义一个City类，该class具有如下字段:
    name: 名称，String类型
    latitude: 纬度，double类型
    longitude: 经度，double类型
  实例化几个City并赋值，然后打印。
* */
public class DemoObjectCity {
    public static void main(String[] args) {
        City lf = new City();
        lf.setName("LinFen");
        lf.setLatitude(23.21);
        lf.setLongitude(87.938);
        System.out.println("城市名称为：" + lf.getName());
        System.out.println("纬度：" + lf.getLatitude());
        System.out.println("经度：" + lf.getLongitude());
    }

}

