package niit.soft.beans;

import javax.naming.ldap.LdapName;
import java.text.Collator;
import java.util.*;

public class RandomDemo {
    public static void main(String[] args) {
        //英文
        Comparator cmp = Collator.getInstance(Locale.CHINA);
//        String[] str = {"a", "b", "c", "d", "e", "f"};
        /*String[] rands = new String[2];
        int len = str.length;
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            rands[i] = str[random.nextInt(len)];
        }
        System.out.println(rands[0] + rands[1]);

        List<String> list= Arrays.asList(str);
        System.out.println("list"+list);
        Collections.shuffle(list);
        System.out.println("list2"+list);
        Collections.sort(list);
        System.out.println("list3"+list);



*///中文
        String[] str = {"张三", "李四", "王五", "麻六", "田七", "周八"};
        Arrays.sort(str, cmp);
        for (String st : str) {
            System.out.println(st + "\t");
        }
        System.out.println();
    }
}
