package model.lifecycle;


import model.Condition;

import java.time.Month;
import java.util.Optional;

public class Planting extends Stage {
	private Optional<Condition> condition;
	private int distanceInDepthCm;
	private int distanceInRowCm;
	private int distanceBetweenRowsCm;

	public Planting(int year, Month month, int week, Condition condition, int distanceInDepthCm, int distanceInRowCm,
		int distanceBetweenRowsCm, String comment) {
		super(year, month, week, comment);
		this.condition = Optional.ofNullable(condition);
		this.distanceInDepthCm = distanceInDepthCm;
		this.distanceInRowCm = distanceInRowCm;
		this.distanceBetweenRowsCm = distanceBetweenRowsCm;
	}

	public Optional<Condition> getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = Optional.ofNullable(condition);
	}

	public int getDistanceInDepthCm() {
		return distanceInDepthCm;
	}

	public void setDistanceInDepthCm(int distanceInDepthCm) {
		this.distanceInDepthCm = distanceInDepthCm;
	}

	public int getDistanceInRowCm() {
		return distanceInRowCm;
	}

	public void setDistanceInRowCm(int distanceInRowCm) {
		this.distanceInRowCm = distanceInRowCm;
	}

	public int getDistanceBetweenRowsCm() {
		return distanceBetweenRowsCm;
	}

	public void setDistanceBetweenRowsCm(int distanceBetweenRowsCm) {
		this.distanceBetweenRowsCm = distanceBetweenRowsCm;
	}
}
