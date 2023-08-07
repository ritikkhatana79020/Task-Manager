package com.ritik.Task.Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ritik.Task.Manager.Models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
