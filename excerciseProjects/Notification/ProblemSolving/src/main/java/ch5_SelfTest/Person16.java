package ch5_SelfTest;

public class Person16 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person16 p = new Person16();
        p.setName("Mg");
        p.setAge(11);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.setPerson("John", 10);
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }
}
