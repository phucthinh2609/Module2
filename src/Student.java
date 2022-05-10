
public class Student {
    int rollNo;
    String name;
    boolean gender;

    public Student(){
    }

    public Student(int rollNo, String name, String gender) {
        this.rollNo = rollNo;
        this.name = name;
        if(gender.equals("Male"))
            this.gender = true;
        if(gender.equals("Female"))
            this.gender = false;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", gender='" + (gender? "Male" : "Female")+
                '}';
    }
}
