package com.example.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;
    static {
        todos.add(new Todo(++todoCount, "abhivansh", "Learn Spring MVC", LocalDate.now().plusDays(10), false));
        todos.add(new Todo(++todoCount, "abhivansh", "Learn Spring Security", LocalDate.now().plusDays(15), false));
        todos.add(new Todo(++todoCount, "abhivansh", "Learn DevOps", LocalDate.now().plusDays(20), false));
    }

    public static List<Todo> retrieveTodos(String user) {
        return todos;
    }

    public void addTodo(String user, String desc, LocalDate targetDate, boolean isDone) {
        Todo todo = new Todo(++todoCount, user, desc, targetDate, isDone);
        todos.add(todo);

    }
}
