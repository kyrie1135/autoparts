package com.mixone.portal.admin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ttle: Test.java
 * Description: <r>
 *
 * @author maogx
 * @version $Revision: $
 * @date 2018/6/27 12:36
 */
public class Test {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date1 = new Date(1420041600000L);
        String res = simpleDateFormat1.format(date1);
        System.out.println(res);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date2 = simpleDateFormat2.parse("2018-01-01 00:00:00");
            System.out.println(date2.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis());


        for (int i = 0; i < 1000; i++) {
//            long id = IdUtil.ID64();
//            System.out.println(Long.toBinaryString(id));
//            System.out.println(id);
        }
    }
}
