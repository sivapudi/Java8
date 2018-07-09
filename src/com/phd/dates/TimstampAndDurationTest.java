package com.phd.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class TimstampAndDurationTest {
	public static void main(String[] args) {

		Instant instant = Instant.now();
		System.out.println("=======Instant=====================");
		System.out.println(instant.toString());
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString());
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString());
		System.out.println(instant.minusSeconds(10).toString());
		System.out.println("=======Duration=====================");

		Duration duration = Duration.ofMillis(5000);
		System.out.println(duration.toString());

		duration = Duration.ofSeconds(60);
		System.out.println(duration.toString());

		duration = Duration.ofMinutes(10);
		System.out.println(duration.toString());

		duration = Duration.ofHours(2);
		System.out.println(duration.toString());

		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
		System.out.println(duration.toString());
		System.out.println("=========Period=====================");

		Period period = Period.ofDays(6);
		System.out.println(period.toString()); 

		period = Period.ofMonths(6);
		System.out.println(period.toString()); 

		period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
		System.out.println(period.toString());
	}

}
