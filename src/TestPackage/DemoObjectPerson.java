package TestPackage;

public class DemoObjectPerson {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(12);
        System.out.println("name：" + ming.getName());
        System.out.println("age：" + ming.getAge());


    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
