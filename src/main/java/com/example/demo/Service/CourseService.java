package com.example.demo.Service;

import com.example.demo.Model.Category;
import com.example.demo.Model.Course;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository, CategoryRepository categoryRepository) {
        this.courseRepository = courseRepository;
        this.categoryRepository = categoryRepository;
    }
    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    public List<Category> getAllCate(){
        return categoryRepository.findAll();
    }
}
