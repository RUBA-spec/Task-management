package com.example.TaskSphere.service;

import com.example.TaskSphere.dto.TaskRequestDTO;
import com.example.TaskSphere.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.TaskSphere.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(TaskRequestDTO dto) {


        //creating a new task first
        Task task = new Task();
        //dto.getTitle fetches the title from the user which is in json format
        //dto.setTitle sets the title to the fetched value
        task.setTitle(dto.getTitle());
        task.setStatus(dto.getStatus());
        task.setUserId(dto.getUserId());
        task.setDueDate(dto.getDueDate());
        return taskRepository.save(task);


    }
}
