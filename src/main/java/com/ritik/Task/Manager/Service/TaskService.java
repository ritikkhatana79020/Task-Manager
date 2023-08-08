package com.ritik.Task.Manager.Service;


import java.util.List;

import com.ritik.Task.Manager.Models.Task;

public interface TaskService {

    Task addTask(Task task);

    List<Task> getAllTasks();


    
}
