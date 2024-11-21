package ch.fhnw.richards.week04_YourOwnClasses_Part2.solutions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayAsLong {

	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
		String result = LocalDate.now().format(format);
		Long answer = todayAsLong(); 
		boolean correct = result.equals(answer.toString());
		System.out.println(correct ? "correct" : "wrong");
	}
	
	public static long todayAsLong() {
		LocalDate today = LocalDate.now();
		long value = today.getYear() * 10000;
		value = value + today.getMonthValue() * 100;
		value = value + today.getDayOfMonth();
		return value;
	}

}
