package com.baidu.org.week.demo001;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.HashMap;
import java.util.Map;

/******************************
 * @author : liuyang
 * <p>ProjectName:javadate  </p>
 * @ClassName :  LocalDateTest
 * @date : 2018/12/5 0005
 * @time : 17:48
 * @createTime 2018-12-05 17:48
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/
public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate localDateMax = LocalDate.MAX;
        System.out.println("localDateMax年的最大取值范围 :\n" + localDateMax);

        LocalDate localDateMin = LocalDate.MIN;
        System.out.println("localDateMin年的最小取值范围 :\n" + localDateMin);

        LocalDate localDate = LocalDate.now();

        System.out.println("localDate获取当前yyyy-mm-dd :\n" + localDate);

        LocalDate localDateSystem = LocalDate.now(ZoneId.systemDefault());

        System.out.println("当前系统默认时间:\n" + localDateSystem);

        LocalDate localDateChinese = LocalDate.now(ZoneId.of("GMT+8", new HashMap<>(64)));

        System.out.println("获取某个时区的国家当前日期:\n" + localDateChinese);


        Clock clock = Clock.systemDefaultZone();
        LocalDate localDateClock = LocalDate.now(clock);
        System.out.println("localDateClock使用默认时区转换为日期和时间yyyy-mm-dd:\n" + localDateClock);

        LocalDate nextMonday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        System.out.println("nextMonday下周一的日期 :\n" + nextMonday);

        LocalDate localDateGet = LocalDate.now();

        System.out.println("localDateGet获取当前是一年的第几天 :\n" + localDateGet.getDayOfYear());
        System.out.println("localDateGet获取当前是本月的第几天 :\n" + localDateGet.getDayOfMonth());
        System.out.println("localDateGet获取当前星期几 :\n" + localDateGet.getDayOfWeek());
        System.out.println("localDateGet获取当前年 :\n" + localDateGet.getYear());
        System.out.println("localDateGet获取当前月 :\n" + localDateGet.getMonth());


        LocalDate localDateOf = LocalDate.of(2018, 12, 30);

        System.out.println("localDateOf获取设置的yyyy-mm-dd:\n" + localDateOf);

        LocalDate localDateOfYearDay = LocalDate.ofYearDay(2018, 352);

        System.out.println("localDateOfYearDay获取一年的第352天是哪月哪日的yyyy-mm-dd:\n" + localDateOfYearDay);

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("1970年的365天后是:\n" + dateFromBase);

        LocalDate localDateFormatNow = LocalDate.from(ZonedDateTime.now());
        System.out.println("当前日期是:\n" + localDateFormatNow);

        LocalDate localDateText = LocalDate.parse("2018-12-05");
        System.out.println("localDateText输出字符串日期 :\n" + localDateText);

        LocalDate localDateFormat = LocalDate.parse("20181223", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDateFormat格式化日期 :\n" + localDateFormat);

    }
}
