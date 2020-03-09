package com.elton.app.springboothystrix.repository.impl;

import org.springframework.stereotype.Repository;

import com.elton.app.springboothystrix.domain.Task;
import com.elton.app.springboothystrix.exception.TaskNotFoundException;
import com.elton.app.springboothystrix.repository.TaskRespository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Repository
public class TaskRepositoryImpl implements TaskRespository{

	@HystrixCommand(fallbackMethod = "saveFallback", ignoreExceptions = {}, commandKey = "saveHystrix")
	@Override
	public Task save(final Task task) {
		throw new TaskNotFoundException("Task não encontrada. ");
	}

	public Task saveFallback(final Task task) {
		return task;
	}
}