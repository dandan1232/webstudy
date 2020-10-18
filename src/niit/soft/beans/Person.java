package niit.soft.beans;

public class Person {
    private String name="张三";
    private int age=20;
    private boolean isBoy=true;

    public String say(String content){
        return name+"说---"+content;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public Person(String name, int age, boolean isBoy) {
        this.name = name;
        this.age = age;
        this.isBoy = isBoy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBoy=" + isBoy +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }
}
