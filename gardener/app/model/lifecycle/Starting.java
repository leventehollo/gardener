package model.lifecycle;

import model.Condition;

import java.time.Month;
import java.util.Optional;

public class Starting extends Stage {
	private Optional<Condition> condition;

	public Optional<Condition> getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = Optional.ofNullable(condition);
	}

	public Starting(Month month, int week, Condition condition, String comment) {
		super(0, month, week, comment);
		this.condition = Optional.ofNullable(condition);
	}
}
