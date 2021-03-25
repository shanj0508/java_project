package TestPackage;

public class DemoObjectOverload {

    public static void main(String[] args) {
        Person2 ming = new Person2();
        ming.setName("小明");
        System.out.println("ming.name:" + ming.getName());
        Person2 hong = new Person2();
        hong.setName("Xiao", "Hong");
        System.out.println("hong.name:" + hong.getName());

    }
}

class Person2 {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String lastname, String firstname) {
        this.name = lastname + firstname;

    }
}
