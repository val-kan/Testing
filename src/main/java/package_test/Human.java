package package_test;

public class Human {

    private String name;
    private String sex;
    private int age;

    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void canTalk(){
        System.out.println("Hello!");
    }
    public void canSwim(){
        System.out.println("I can swim!");
    }
    public void getInfo(){
        System.out.println("My name is "+name+" and I am "+ sex + "and I am "+ age+" yers old!");
    }
    public int myage(){
        return age;
    }
}
