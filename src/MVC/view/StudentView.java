package MVC.view;

import MVC.model.StudentModule;

import java.time.format.DateTimeFormatter;

public class StudentView {
    public void showHomePage(){
        System.out.println("===HOME PAGE===");
    }

    public void showDetailPage(StudentModule student){
        System.out.println("Student: ");
        System.out.println("Id: "+student.getId());
        System.out.println("Name: "+student.getName());
        System.out.println("Updated Date: "+student.getUpdateDateTime().format(DateTimeFormatter.ofPattern("dd/MM/yy")));
        System.out.println("---------------------------");
    }

    public void showUpdatedPage(StudentModule student){
        System.out.println("Save successfully");
        showDetailPage(student);
    }

    public void showErrorMessage(){
        System.out.println("ERROR!!!");
    }
}
