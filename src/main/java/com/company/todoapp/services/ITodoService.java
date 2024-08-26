package com.company.todoapp.services;

import com.company.todoapp.models.Todo;

import java.util.List;

public interface ITodoService {


  public List<Todo> getAllTodos();

  public Todo getById(int id);

  public List<Todo> getByTitle(String title);

  public Todo addTodo(Todo todo);

  public Todo updateTodo(int id, Todo todo);

  public Todo deleteTodo(int id);

}
