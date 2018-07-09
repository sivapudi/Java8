package com.phd.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class DateTimZoneTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString());
		System.out.println(localDate.getDayOfWeek().toString());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.plusDays(12).toString());
		System.out.println("-----------------------------------");

		LocalTime localTime = LocalTime.of(12, 20);
		System.out.println(localTime.toString());
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		System.out.println("-----------------------------------");

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString()); 
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getNano());
		System.out.println("-----------------------------------");
		
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime.toString());
		offsetDateTime = OffsetDateTime.now(ZoneId.of("Brazil/East"));
		System.out.println(offsetDateTime.toString()); 
	}

}