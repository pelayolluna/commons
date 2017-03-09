/*
 * Copyright 2016 Pelayo Jose Lluna Gonzalez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pelayolluna.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtilities {

	private static final String DATE = "dd.MM.yyyy";
	private static final String TIME = "hh:mm:ss";

	public static Date formatDate(int day, int month, int year) {
		final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE);
		final StringBuilder sb = new StringBuilder();
		Date date = new Date();

		sb.append(String.valueOf(day) + "-");
		sb.append(String.valueOf(month) + "-");
		sb.append(String.valueOf(year));

		try {
			date = dateFormat.parse(sb.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

	public static Date formatDate(int day, int month, int year, int hour, int minute, int second) {
		final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE + " " + TIME);
		final StringBuilder sb = new StringBuilder();
		Date date = new Date();

		sb.append(String.valueOf(day) + "-");
		sb.append(String.valueOf(month) + "-");
		sb.append(String.valueOf(year) + " ");
		sb.append(String.valueOf(hour) + ":");
		sb.append(String.valueOf(minute) + ":");
		sb.append(String.valueOf(second));

		try {
			date = dateFormat.parse(sb.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}
	
	public static Date getDateSum(Date beginDate, Date endDate) {
		return new Date(beginDate.getTime() + endDate.getTime());
	}
}
