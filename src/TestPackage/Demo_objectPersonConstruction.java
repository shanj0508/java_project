package TestPackage;

public class Demo_objectPersonConstruction {
    public static void main(String[] args) {
        Person1 ming = new Person1("小明", 18);
        System.out.println("姓名：" + ming.getName());
        System.out.println("年龄：" + ming.getAge());


    }
}

class Person1 {
    private String name;
    private int age;

    public Person1() {
    }

    //构造函数
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
