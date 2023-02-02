package com.kevin.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(
                2018,12,25,8,0,0);
        LocalDateTime leave = LocalDateTime.of(
                2018,12,25,10,8,0);

        Car car = new Car("AWR-8119",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());

        long hours = (long) Math.ceil(car.getDuration() /60.0);
        System.out.println(hours);

//        //java 8
//        Instant instant = Instant.now();
//        System.out.println(instant);
//        //Local
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
//        System.out.println(formatter.format(now)) ;
//        System.out.println( now.plus(Duration.ofHours(3)));
//
//        LocalDateTime localDateTime = LocalDateTime.
//                of(2023,2,14,8,0,0);
//        System.out.println(localDateTime);



        //java();
    }

    public static void java(){
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf.format(date));

        String s = "2018/11/25 08:00:00";

        try {
            Date other = sdf.parse(s);
            System.out.println(other);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,8);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
