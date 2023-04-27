package com.example.demo.Controller;

import com.example.demo.Model.Category;
import com.example.demo.Model.Course;
import com.example.demo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseController {


    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(path = "/detail")
    public String detailCourse(Model model){
        List<Course> courseList = courseService.getAll();
        model.addAttribute("courses", courseList);
        return "single-course";
    }

    @GetMapping(path = "/")
    public String homepage(Model model){
        List<Category> courseList = courseService.getAllCate();
        model.addAttribute("courses", courseList);
        return "homepage";
    }
    @GetMapping(path = "/course")
    public String allCourse(Model model){
        List<Category> courseList = courseService.getAllCate();
        model.addAttribute("courses", courseList);
        return "courses";
    }

    @GetMapping(path = "/blog")
    public String blog(Model model){
        return "blog";
    }

    @GetMapping(path = "/element")
    public String element(Model model){
        return "elements";
    }
}
