package model.lifecycle;

import java.time.Month;
import java.util.Optional;

public abstract class Stage {

	private int year;
	private Month month;
	private int week;
	private Optional<String> comment;

	protected Stage(int year, Month month, int week, String comment) {
		this.year = year;
		this.month = month;
		this.week = week;
		this.comment = Optional.ofNullable(comment);
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public Optional<String> getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = Optional.ofNullable(comment);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
