package niit.soft.beans;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {
    /**
利用Person类来理解反射机制
通过对象名查找对象所对应的类名（包括包名），getsimplename：只获得类名
 */
    @Test
    void tese01() {
        Person p = new Person("张三", 20);
        System.out.println("类名：" + p.getClass().getName());
    }
 /**
通过无参方法创建对象
*/
 @Test
    void test02()throws Exception{
     Class clazz=Class.forName("niit.soft.beans.Person");
     //通过clazz来创建对象
     Person p=(Person) clazz.newInstance();
     p.setName("李四");
     p.setAge(20);
     p.setBoy(true);
     System.out.println(p);
 }
/**
 * 通过有参构造方法创建对象
 */
@Test
    void test03()throws Exception{
    Class clazz=Class.forName("niit.soft.beans.Person");
    //通过反射机制获得所有的构造方法
    Constructor[] cons=clazz.getConstructors();
    System.out.println(clazz.getSimpleName()+"一共有"+cons.length+"个构造方法");
    int count=0;
    for(Constructor con:cons){
        System.out.println("第"+(++count)+"个构造方法：");
        Type[] types=con.getParameterTypes();
        for(Type t:types){
            System.out.println(t+"\t");
        }
        System.out.println();
        //用带三个参数的构造方法创建对象
        if (con.getParameterCount()==3){
            Person p=(Person)con.newInstance("王五",20,true);
            System.out.println(p);
        }
    }
}
/**
 * 通过反射访问属性
 */
@Test
    void test04()throws Exception{
    Class clazz=Class.forName("niit.soft.beans.Person");
    Object p=clazz.newInstance();
    //获得类中指定名称的属性
    Field nameField=clazz.getDeclaredField("name");
    //设置通过反射访问该属性时取消权限检查
    nameField.setAccessible(true);

    //调用set方法为p对象的指定属性赋值
    nameField.set(p,"张三");

    Field ageField=clazz.getDeclaredField("age");
    ageField.setAccessible(true);
    ageField.set(p,20);

    Field isBoyField=clazz.getDeclaredField("isBoy");
    isBoyField.setAccessible(true);
    isBoyField.set(p,false);

    System.out.println(p);
}
//通过反射访问方法
    @Test
    void test05()throws Exception{
    Class clazz=Class.forName("niit.soft.beans.Person");
        Method md=clazz.getMethod("say",String.class);
        Person p=(Person)clazz.newInstance();
        p.setName("薛之谦");
       //String str=(String) md.invoke(clazz.newInstance(),"今天天气真好"); 姓名為空
        String str=(String) md.invoke(p,"你像天外来物一样求之不得");
        System.out.println(str);
    }

}