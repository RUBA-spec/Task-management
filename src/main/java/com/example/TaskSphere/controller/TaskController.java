package com.example.TaskSphere.controller;

import com.example.TaskSphere.dto.TaskRequestDTO;
import com.example.TaskSphere.service.TaskService;
import jakarta.validation.Valid;
import com.example.TaskSphere.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController  //controls the http request and give the output in the format of json
@RequestMapping("/tasks")
public class TaskController {
   @Autowired
    private TaskService taskService;
   @PostMapping("/tasks")
       public ResponseEntity<Task> createTask(@RequestBody @Valid TaskRequestDTO dto){
       Task savedTask=taskService.createTask(dto);
       return ResponseEntity.ok(savedTask);
   }
}
