package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/task")
public class TaskController {

    @Autowired
    private DbService service;
    @Autowired
    private TaskMapper taskMapper;


    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks(){
        return taskMapper.mapToTaskDtoList(service.getAllTasks());
    }
    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public Optional<Task> getTask(Long id){
        return service.getTaskById(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public String deleteTask(String taskId) {
        return "TASK DELETED";
    }
    @RequestMapping(method = RequestMethod.PUT, value = "updateTasks")
    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto((long)3,"Edited test title","Edited conent");
    }
    @RequestMapping(method = RequestMethod.POST, value = "createTasks")
    public void createTask(TaskDto taskDto){

    }
}
