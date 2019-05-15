package cn.zyz.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @RequestMapping("query")
    public String textStu(){

        return "springboot";
    }

}
