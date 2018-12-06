package com.baidu.org.week.demo002;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashMap;

/******************************
 * @author : liuyang
 * <p>ProjectName:javadate  </p>
 * @ClassName :  LocalDateTimeTime
 * @date : 2018/12/6 0006
 * @time : 10:48
 * @createTime 2018-12-06 10:48
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class LocalDateTimeTest {


    public static void main(String[] args) {


        LocalDateTime localDate = LocalDateTime.now();

        System.out.println("localDate获取当前yyyy-mm-dd :\n" + localDate);

        LocalDateTime localDateSystem = LocalDateTime.now(ZoneId.systemDefault());

        System.out.println("当前系统默认时间:\n" + localDateSystem);

        LocalDateTime localDateChinese = LocalDateTime.now(ZoneId.of("GMT+8", new HashMap<>(64)));

        System.out.println("获取某个时区的国家当前日期:\n" + localDateChinese);

        LocalDateTime localDateOf = LocalDateTime.of(2018, 12, 05, 11, 12, 12);

        System.out.println("localDateOf获取设置的yyyy-mm-dd:\n" + localDateOf);

        LocalDateTime localDateOfYearDay = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC+8", new HashMap<>(64)));

        System.out.println("localDateOfYearDay获取一年的第352天是哪月哪日的yyyy-mm-dd:\n" + localDateOfYearDay);

        Clock clock = Clock.systemDefaultZone();
        LocalDateTime localDateClock = LocalDateTime.now(clock);
        System.out.println("localDateClock使用默认时区转换为日期和时间yyyy-mm-dd:\n" + localDateClock);

        LocalDateTime localDateGet = LocalDateTime.now();

        System.out.println("localDateGet获取当前是一年的第几天 :\n" + localDateGet.getDayOfYear());
        System.out.println("localDateGet获取当前是本月的第几天 :\n" + localDateGet.getDayOfMonth());
        System.out.println("localDateGet获取当前星期几 :\n" + localDateGet.getDayOfWeek());
        System.out.println("localDateGet获取当前年 :\n" + localDateGet.getYear());
        System.out.println("localDateGet获取当前月 :\n" + localDateGet.getMonth());

        LocalDateTime localDateMax = LocalDateTime.MAX;
        System.out.println("localDateMax年的最大取值范围 :\n" + localDateMax);

        LocalDateTime localDateMin = LocalDateTime.MIN;
        System.out.println("localDateMin年的最小取值范围 :\n" + localDateMin);

        LocalDateTime localDateText = LocalDateTime.parse("2018-12-05T11:22:22");
        System.out.println("localDateText输出字符串日期 :\n" + localDateText);

        LocalDateTime localDateFormat = LocalDateTime.parse("2018-12-05T11:22:22", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("localDateFormat格式化日期 :\n" + localDateFormat);

        LocalDateTime localDateFormatNow = LocalDateTime.from(ZonedDateTime.now());
        System.out.println("当前日期是:\n" + localDateFormatNow);

        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(200, 20, ZoneOffset.UTC);
        System.out.println("1970年的365天后是:\n" + dateFromBase);
    }
}
