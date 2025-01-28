package com.example.apptp2.repository;

import com.example.apptp2.modele.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
  //add comment
}
