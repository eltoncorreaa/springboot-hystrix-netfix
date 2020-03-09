package com.elton.app.springboothystrix.domain;

import com.elton.app.springboothystrix.repository.TaskRespository;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Task {

	private Integer id;
	private String description;

	@Getter(value = AccessLevel.NONE) @Setter(value = AccessLevel.NONE)
	private transient TaskRespository repository;

	public Task(final TaskRespository repository) {
		this.repository = repository;
	}

	public Task save(final Task task) {
		return repository.save(task);
	}
}