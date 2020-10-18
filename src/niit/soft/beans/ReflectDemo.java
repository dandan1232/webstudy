package niit.soft.beans;

public class ReflectDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("由对象查找类：" +
                p.getClass().getSimpleName());
    }
}
