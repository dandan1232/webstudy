package niit.soft.beans;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {
    /**
����Person������ⷴ�����
ͨ�����������Ҷ�������Ӧ��������������������getsimplename��ֻ�������
 */
    @Test
    void tese01() {
        Person p = new Person("����", 20);
        System.out.println("������" + p.getClass().getName());
    }
 /**
ͨ���޲η�����������
*/
 @Test
    void test02()throws Exception{
     Class clazz=Class.forName("niit.soft.beans.Person");
     //ͨ��clazz����������
     Person p=(Person) clazz.newInstance();
     p.setName("����");
     p.setAge(20);
     p.setBoy(true);
     System.out.println(p);
 }
/**
 * ͨ���вι��췽����������
 */
@Test
    void test03()throws Exception{
    Class clazz=Class.forName("niit.soft.beans.Person");
    //ͨ��������ƻ�����еĹ��췽��
    Constructor[] cons=clazz.getConstructors();
    System.out.println(clazz.getSimpleName()+"һ����"+cons.length+"�����췽��");
    int count=0;
    for(Constructor con:cons){
        System.out.println("��"+(++count)+"�����췽����");
        Type[] types=con.getParameterTypes();
        for(Type t:types){
            System.out.println(t+"\t");
        }
        System.out.println();
        //�ô����������Ĺ��췽����������
        if (con.getParameterCount()==3){
            Person p=(Person)con.newInstance("����",20,true);
            System.out.println(p);
        }
    }
}
/**
 * ͨ�������������
 */
@Test
    void test04()throws Exception{
    Class clazz=Class.forName("niit.soft.beans.Person");
    Object p=clazz.newInstance();
    //�������ָ�����Ƶ�����
    Field nameField=clazz.getDeclaredField("name");
    //����ͨ��������ʸ�����ʱȡ��Ȩ�޼��
    nameField.setAccessible(true);

    //����set����Ϊp�����ָ�����Ը�ֵ
    nameField.set(p,"����");

    Field ageField=clazz.getDeclaredField("age");
    ageField.setAccessible(true);
    ageField.set(p,20);

    Field isBoyField=clazz.getDeclaredField("isBoy");
    isBoyField.setAccessible(true);
    isBoyField.set(p,false);

    System.out.println(p);
}
//ͨ��������ʷ���
    @Test
    void test05()throws Exception{
    Class clazz=Class.forName("niit.soft.beans.Person");
        Method md=clazz.getMethod("say",String.class);
        Person p=(Person)clazz.newInstance();
        p.setName("Ѧ֮ǫ");
       //String str=(String) md.invoke(clazz.newInstance(),"�����������"); �������
        String str=(String) md.invoke(p,"������������һ����֮����");
        System.out.println(str);
    }

}