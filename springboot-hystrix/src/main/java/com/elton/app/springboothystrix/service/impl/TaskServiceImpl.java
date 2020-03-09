package com.elton.app.springboothystrix.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elton.app.springboothystrix.domain.Task;
import com.elton.app.springboothystrix.dto.request.TaskRequest;
import com.elton.app.springboothystrix.dto.response.TaskResponse;
import com.elton.app.springboothystrix.repository.TaskRespository;
import com.elton.app.springboothystrix.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRespository repository;

	@Override
	public TaskResponse save(final TaskRequest request) {
		final Task task = TaskRequest.toDomain(request);
		return TaskResponse.fromDomain(new Task(repository).save(task));
	}
}