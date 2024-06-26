package com.example.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;
    static {
        todos.add(new Todo(++todoCount, "abhivansh", "Learn Spring MVC", LocalDate.now().plusDays(10), false));
        todos.add(new Todo(++todoCount, "abhivansh", "Learn Spring Security", LocalDate.now().plusDays(15), false));
        todos.add(new Todo(++todoCount, "abhivansh", "Learn DevOps", LocalDate.now().plusDays(20), false));

    }

    public static List<Todo> findByUsername(String user) {

        Predicate<? super Todo> predicate = todo -> todo.getName().equalsIgnoreCase(user);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String user, String desc, LocalDate targetDate, boolean isDone) {
        Todo todo = new Todo(++todoCount, user, desc, targetDate, isDone);
        todos.add(todo);

    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;

    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }

}
