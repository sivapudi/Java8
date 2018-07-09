package com.phd.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ZoneIds {
	public static void main(String[] args) {
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		LocalTime now1 = LocalTime.now(zone1);
		LocalTime now2 = LocalTime.now(ZoneId.of("Brazil/East"));
		System.out.println(now1.isAfter(now2));

		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		List<String> listOfZones = new ArrayList<String>(zoneIds);
		Collections.sort(listOfZones);
		LocalDateTime dt = LocalDateTime.now();

		for (String as : listOfZones) {

			ZoneId zone = ZoneId.of(as);
			ZonedDateTime zdt = dt.atZone(zone);
			ZoneOffset offset = zdt.getOffset();
			String out = String.format("%35s %10s%n", zone, offset);
			System.out.println(out);
		}
	}

}
