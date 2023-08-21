package com.example.webapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/list-todos")
    public String listTodos(ModelMap model) {
        List<Todo> todos = todoService.retrieveTodos("admin");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        String user = (String) model.get("name");

        Todo todo = new Todo(0, user, "null", LocalDate.now().plusDays(2), false);
        model.addAttribute("todo", todo);
        // List<Todo> todos = todoService.retrieveTodos("admin");
        // model.addAttribute("todos", todos);
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addNewTodoPage(ModelMap model, Todo todo) {
        String user = (String) model.get("name");
        todoService.addTodo(user, todo.getDescription(), LocalDate.now().plusYears(1), false);
        // List<Todo> todos = todoService.retrieveTodos("admin");
        // model.addAttribute("todos", todos);
        return "redirect:list-todos";
    }

}
