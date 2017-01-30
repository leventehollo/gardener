package model.lifecycle;

import java.util.Optional;

public class Lifecycle {

	private Optional<Starting> starting;
	private Planting planting;
	private Harvesting harvesting;
	private boolean isPerennial;

	public Lifecycle(Optional<Starting> starting, Planting planting, Harvesting harvesting, boolean isPerennial) {
		this.starting = starting;
		this.planting = planting;
		this.harvesting = harvesting;
		this.isPerennial = isPerennial;
	}
}
