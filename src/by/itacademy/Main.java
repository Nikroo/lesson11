package by.itacademy;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specificDate = LocalDate.of(2017, Month.NOVEMBER, 30);
        System.out.println(specificDate);

/*        LocalDate invDate = LocalDate.of(2014, Month.JULY, 33);
        System.out.println(invDate);*/

        LocalDate dateFromBase = LocalDate.ofEpochDay(1000);
        LocalDate dateFromBase1 = LocalDate.ofEpochDay(365).plusDays(365);
        System.out.println(dateFromBase);

        LocalDate day256_2017 = LocalDate.ofYearDay(2014, 256);
        System.out.println(day256_2017);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime today0 = LocalDateTime.of(specificDate, LocalTime.now());
        System.out.println(today0);

        Instant timestamp = Instant.now();
        System.out.println(timestamp);

        Instant cpecificTime0 = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println(cpecificTime0);

        Duration sixtyDay = Duration.ofDays(60);
        System.out.println(sixtyDay);

        System.out.println("Year " + today.getYear() + "-Leap(visokosniy)? :" + today.isLeapYear());

        System.out.println("Today-is befor 02.03.2017?:" + today.isBefore(LocalDate.of(2017,3,2)));

        System.out.println(today.plusDays(30));
        System.out.println(today.plusWeeks(1));
        System.out.println(today.plusMonths(12));

        LocalDate dateFormator = LocalDate.now();
        System.out.println(dateFormator);
        System.out.println(dateFormator.format(DateTimeFormatter.ofPattern("d::MMM::uuu")));
        System.out.println(dateFormator.format(DateTimeFormatter.BASIC_ISO_DATE));


    }
}
