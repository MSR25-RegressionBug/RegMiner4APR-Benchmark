package com.blade.kit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author biezhi
 * @date 2017/9/20
 */
public class DateKitTest {

    private long          time;
    private Date          date;
    private LocalDateTime localDateTime;

    @Before
    public void before() {
        time = 1505892010L;
        date = new Date(1505892470110L);
        localDateTime = LocalDateTime.from(Instant.ofEpochSecond(time).atZone(ZoneId.systemDefault()));
    }

    @Test
    public void testToString2() {
        String dateStr = DateKit.toString(time, "yyyy-MM-dd");
        Assert.assertEquals("2017-09-20", dateStr);
    }

    @Test
    public void testToDateTime() {
        Date date = DateKit.toDate("2017-09-09", "yyyy-MM-dd");
        Assert.assertNotNull(date);

        date = DateKit.toDate(time);
        Assert.assertNotNull(date);

        Date dateTime = DateKit.toDateTime("2017-09-09 11:22:33", "yyyy-MM-dd HH:mm:ss");
        Assert.assertNotNull(dateTime);

        LocalDate localDate = DateKit.toLocalDate("2017-09-09", "yyyy-MM-dd");
        Assert.assertNotNull(localDate);

        LocalDateTime localDateTime = DateKit.toLocalDateTime("2017-09-09 11:22:33", "yyyy-MM-dd HH:mm:ss");
        Assert.assertNotNull(localDateTime);
    }
}
