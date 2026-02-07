package org.example.services;

import org.example.models.Status;

import java.util.List;

public interface IService<Task> {
    void add(Task task);
    void update(Task task);
    boolean delete(int taskId);
    Task getById(int taskId);
    List<Task> getAll();
    List<Task> getByStatus(Status status);
}
