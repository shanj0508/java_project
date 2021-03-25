package TestPackage;

public class Demo_objectOverload {
    //TODO:这个结果是为啥？
//    public static void main(String[] args) {
//        String s = "Test string";
//        int n1 = s.indexOf('t');
//        int n2 = s.indexOf("st");
//        int n3 = s.indexOf("st", 4);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//    }

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
