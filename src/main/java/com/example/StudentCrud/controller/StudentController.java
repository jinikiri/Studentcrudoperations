package com.example.StudentCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentCrud.domain.student;
import com.example.StudentCrud.service.StudentService;

import java.util.List;

@Controller
public class StudentController {
	
	@Autowired
    private StudentService service;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<student> liststudent = service.listAll();
        model.addAttribute("srikanthstudent", liststudent);
        System.out.print("Get / ");
        return "index";
    }
    //adding new line by srikanth
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new student());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") student std) {
    	System.out.println(std.getCourse()+""+std.getFee());
    	if(std.getFee()>500)
    	{
    		int increased_fee= std.getFee()+1000;
    		std.setFee(increased_fee);
    	}
        service.save(std);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{ID}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "ID") int id) {
        ModelAndView mav = new ModelAndView("new");
        student std = service.get(id);
        mav.addObject("student", std);
        return mav;
    }
    
    @RequestMapping("/delete/{ID}")
    public String deletestudent(@PathVariable(name = "ID") int id) {
        service.delete(id);
        return "redirect:/";
    }

}
