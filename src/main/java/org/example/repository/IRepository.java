package org.example.repository;

import org.example.models.Status;

import java.util.List;

public interface IRepository<Task> {

    void add(Task task);
    void update(Task task);
    boolean delete(int taskId);
    Task getById(int taskId);
    List<Task> getAll();
    List<Task> getByStatus(Status status);
}
