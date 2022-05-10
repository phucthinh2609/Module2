package MVC.model;

import java.time.LocalDate;

public class StudentModule {
    private int id;
    private String name;
    private LocalDate updateDateTime;

    public StudentModule(){
    }

    public StudentModule(int id, String name, LocalDate updateDateTime){
        this.id = id;
        this.name = name;
        this.updateDateTime = updateDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDate updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public boolean save(){
        if(name.length()<=10){
            this.updateDateTime = LocalDate.now();
            return true;
        }else
            return false;
    }
}
