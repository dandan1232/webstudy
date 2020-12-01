package jdbcDemo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 蛋宝
 * @date 2020/11/27 10:17
 * @description TimeStamp时间戳
 */
public class TimeStamp {
    public String getTimeStamp(){
        StringBuffer sb=new StringBuffer();
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyyMMddhhmmssSSS");
        sb.append(df.format(now));
        for (int i=0;i<3;i++){
            sb.append((int)( Math.random()*10));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TimeStamp ts=new TimeStamp();
        System.out.println(ts.getTimeStamp());
    }
}
