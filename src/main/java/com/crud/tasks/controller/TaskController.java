package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks(){
        List<TaskDto> tasks = new ArrayList<>();
        tasks.add(new TaskDto((long)1,"Title1","Content 1"));
        tasks.add(new TaskDto((long)1,"Title2","Content 2"));
        tasks.add(new TaskDto((long)1,"Title3","Content 3"));
        tasks.add(new TaskDto((long)1,"Title4","Content 4"));
        return tasks;
    }
    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDto getTask(String taskId){
        return new TaskDto((long)1,"test title","conent");
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
