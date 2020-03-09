package com.elton.app.springboothystrix.dto.response;

import com.elton.app.springboothystrix.domain.Task;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TaskResponse {

	private Integer id;
	private String description;

	public static TaskResponse fromDomain(final Task task) {
		final TaskResponse response= new TaskResponse();
		response.setId(task.getId());
		response.setDescription(task.getDescription());
		return response;
	}
}