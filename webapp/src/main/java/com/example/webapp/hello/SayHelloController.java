package com.example.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    @RequestMapping("/hello-html")
    @ResponseBody
    public String sayHelloHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello, World! HTML</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h3>Hello, World!</h3>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/hello-jsp")
    public String sayHelloJSP() {
        return "sayHello";
    }
}
