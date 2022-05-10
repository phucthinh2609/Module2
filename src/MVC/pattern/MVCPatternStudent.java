package MVC.pattern;

import MVC.controller.StudentController;

public class MVCPatternStudent {
    public static void main(String[] args) {
        StudentController control = new StudentController();

        control.showDetail();

        control.changName("Phu");
        control.save();
    }
}
