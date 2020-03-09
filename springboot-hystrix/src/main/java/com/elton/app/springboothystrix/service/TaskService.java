package com.elton.app.springboothystrix.service;

import com.elton.app.springboothystrix.dto.request.TaskRequest;
import com.elton.app.springboothystrix.dto.response.TaskResponse;

public interface TaskService {

	TaskResponse save(TaskRequest request);
}