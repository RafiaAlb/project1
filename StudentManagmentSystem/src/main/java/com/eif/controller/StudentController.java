package com.eif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eif.data.Student;
import com.eif.service.StudentService;

@RestController
public class StudentController {

    @GetMapping("/hi")
    public String Hello()
    {
    	return "Hello Boss!! How are you?";
    }
    @RequestMapping("/hello")
    public String hi() {
        return "good afternoon  ";
    }
    
    private StudentService st_Service;
    
    @RequestMapping(method = RequestMethod.GET,value="/students")
    public List<Student> GetAllStudents(){
    	return st_Service.getStudentList();
    }
    @RequestMapping(method = RequestMethod.GET,value="/student_name/{name}")
    public Student GetStudentByName(@PathVariable String name) {
    	return st_Service.getStudent_byName(name);
    }
    @RequestMapping(method = RequestMethod.GET,value="student_id/{id}")
    public Student GetStudentByID(@PathVariable int Id) {
    	return st_Service.getStudent_ById(Id);
    }
    @RequestMapping(method = RequestMethod.GET,value="/addStudent")
    public void AddStudent(@RequestBody Student st) {
    	st_Service.addStudent(st);
    }
    @RequestMapping(method = RequestMethod.PUT,value="/updateStudent")
    public void updateStudent(@RequestBody Student st) {
    	st_Service.updateStudent(st);
    }
}