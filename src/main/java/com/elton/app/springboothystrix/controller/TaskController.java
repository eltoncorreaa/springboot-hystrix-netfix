package com.elton.app.springboothystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elton.app.springboothystrix.dto.request.TaskRequest;
import com.elton.app.springboothystrix.dto.response.TaskResponse;
import com.elton.app.springboothystrix.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService service;

	@RequestMapping(value = { "/v1/save" }, method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<TaskResponse> list(@RequestBody final TaskRequest request) {
		return new ResponseEntity<>(service.save(request), HttpStatus.OK);
	}
}