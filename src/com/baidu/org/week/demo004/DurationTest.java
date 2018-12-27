package com.baidu.org.week.demo004;

import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

import static java.time.temporal.ChronoUnit.SECONDS;

/******************************
 * @author : liuyang
 * <p>ProjectName:javadate  </p>
 * @ClassName :  DurationTest
 * @date : 2018/12/27 0027
 * @time : 13:51
 * @createTime 2018-12-27 13:51
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/


public class DurationTest {

    public static void main(String[] args) {

        Duration duration = Duration.ZERO;
        System.out.println("持续时间常量值:" + duration.toNanos());
        System.out.println("持续时间常量值是否为零:" + duration.isZero());
        System.out.println("持续时间常量值是正数:" + duration.abs().toNanos());

        Duration durationOfDays = Duration.ofDays(1);
        System.out.println("一天有多少小时:" + durationOfDays.toHours() + "H");

        Duration durationOfHours = Duration.ofHours(2);
        System.out.println("一小时有多少分:" + durationOfHours.toMinutes() + "m");

        Duration durationOfMinutes = Duration.ofMinutes(1);
        System.out.println("一分钟有多少秒:" + durationOfMinutes.getSeconds() + "s");

        Duration durationOfSeconds = Duration.ofSeconds(1);
        System.out.println("一秒有多少秒:" + durationOfSeconds.getSeconds() + "s");

        Duration durationOfSecondsNano = Duration.ofSeconds(2, 2000);
        System.out.println("2000纳秒有多少秒:" + durationOfSecondsNano.getSeconds() + "s");

        Duration durationOfMillis = Duration.ofMillis(5000);
        System.out.println("5000纳秒有多少秒:" + durationOfMillis.getSeconds() + "s");

        Duration durationOfNanos = Duration.ofNanos(10000);
        System.out.println("10000纳秒有多少纳秒:" + durationOfNanos.toNanos() + "s");

        Duration durationOf = Duration.of(10, SECONDS);
        System.out.println("10秒有多少秒:" + durationOf.getSeconds() + "s");

        Duration durationFrom = Duration.from(Duration.ofDays(10));
        System.out.println("10天有多少小时:" + durationFrom.toHours() + "H");

        Duration durationParse = Duration.parse("PT15M");
        System.out.println("格式转化15分钟:" + durationParse.toMinutes() + "M");

        Duration durationBetween = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println("距离今天结束还有多少时间:" + durationBetween.toHours() + "时" + durationBetween.toMinutes() + "分" + durationBetween.getSeconds() + "秒");

    }


}
