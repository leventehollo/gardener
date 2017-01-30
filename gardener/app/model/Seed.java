package model;

import model.lifecycle.Lifecycle;

import java.util.Optional;

public class Seed {

	public final String name;

	public Lifecycle lifecycle;

	public Optional<String> comment;

	public Seed(String name) {
		this.name = name;
	}
}
