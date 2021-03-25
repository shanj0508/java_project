package TestPackage;

public class DemoObjectExtends {
    public static void main(String[] args) {
        Person3 ming = new Person3();
        ming.setName("小明");
        ming.setAge(18);
        System.out.println("ming.name:" + ming.getName() + "\nming.age:" + ming.getAge());
        Student student1 = new Student();
        student1.setName("学生1");
        student1.setAge(13);
        student1.setScore(99);
        System.out.println("student1.name:" + student1.getName() + "\nstudent1.age:" + student1.getAge() + "\nstudent1.score:" + student1.getScore());
    }
}

class Person3 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person3 {
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
