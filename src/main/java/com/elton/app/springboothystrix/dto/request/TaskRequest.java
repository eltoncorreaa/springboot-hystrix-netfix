package com.elton.app.springboothystrix.dto.request;

import com.elton.app.springboothystrix.domain.Task;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TaskRequest {

	private Integer id;
	private String description;

	public static Task toDomain(final TaskRequest taskRequest) {
		final Task domain= new Task();
		domain.setId(taskRequest.getId());
		domain.setDescription(taskRequest.getDescription());
		return domain;
	}
}