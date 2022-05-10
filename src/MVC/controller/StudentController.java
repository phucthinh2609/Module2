package MVC.controller;

import MVC.model.StudentModule;
import MVC.view.StudentView;

import java.time.LocalDate;

public class StudentController {
    private StudentModule student;
    private StudentView view;

    public StudentController(){
        student = new StudentModule(1, "Thinh", LocalDate.now());
        view = new StudentView();
    }

    public void showDetail(){
        view.showDetailPage(student);
    }

    public void changName(String name){
        student.setName(name);
    }

    public void save(){
        if(student.save())
            view.showUpdatedPage(student);
        else
            view.showErrorMessage();
    }
}
