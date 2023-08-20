package com.example.webapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String showNewTodoPage() {
        // List<Todo> todos = todoService.retrieveTodos("admin");
        // model.addAttribute("todos", todos);
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addNewTodoPage() {
        // List<Todo> todos = todoService.retrieveTodos("admin");
        // model.addAttribute("todos", todos);
        return "redirect:list-todos";
    }

}
