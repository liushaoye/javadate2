package com.baidu.org.week.demo003;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/******************************
 * @author : liuyang
 * <p>ProjectName:javadate  </p>
 * @ClassName :  InstantTest
 * @date : 2018/12/11 0011
 * @time : 17:54
 * @createTime 2018-12-11 17:54
 * @version : 2.0
 * @description :
 *
 *   时间戳
 *
 *******************************/


public class InstantTest {


    public static void main(String[] args) {

        Instant instantMax = Instant.MAX;
        System.out.println("instantMax年的最大取值范围 :\n" + instantMax);

        Instant instantMin = Instant.MIN;
        System.out.println("instantMin年的最小取值范围 :\n" + instantMin);

        Instant instantNow = Instant.now();

        System.out.println("instant获取当前yyyy-mm-dd :\n" + instantNow);

        Clock clock = Clock.systemDefaultZone();

        Instant instantClock = Instant.now(clock);

        System.out.println("instantClock获取当前yyyy-mm-dd :\n" + instantClock);

        Instant localDateGet = Instant.now();

        System.out.println("从1970-01-01T00：00：00Z开始的秒数 :\n" + localDateGet.getEpochSecond());
        System.out.println("localDateGet获取当前是本月的第几天 :\n" + localDateGet.atZone(ZoneId.of("GMT+8", new HashMap<>(64))));

        Instant instantEpochSecond = Instant.ofEpochSecond(200);
        System.out.println("从1970-01-01T00：00：00Z的秒数:\n" + instantEpochSecond);

        Instant instantEpochMilli = Instant.ofEpochMilli(600);
        System.out.println("从1970-01-01T00：00：00Z的毫秒数:\n" + instantEpochMilli);

        Instant localDateFormatNow = Instant.from(ZonedDateTime.now());
        System.out.println("当前日期是:\n" + localDateFormatNow);

        Instant instantText = Instant.parse("2007-12-03T10:15:30.00Z");
        System.out.println("instantText输出字符串日期 :\n" + instantText);

    }


}
