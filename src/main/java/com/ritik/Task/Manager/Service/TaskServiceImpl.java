package com.ritik.Task.Manager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritik.Task.Manager.Models.Task;
import com.ritik.Task.Manager.Repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }
    
}
