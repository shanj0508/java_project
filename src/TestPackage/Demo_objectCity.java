package TestPackage;

/*
* 请定义一个City类，该class具有如下字段:
    name: 名称，String类型
    latitude: 纬度，double类型
    longitude: 经度，double类型
  实例化几个City并赋值，然后打印。
* */
public class Demo_objectCity {
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

class City {
    private String name;
    private double latitude;  //纬度
    private double longitude;  //经度

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
}
