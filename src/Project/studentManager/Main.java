package Project.studentManager;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;

        do {
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    inputStudent();
                    break;
                case 2:
                    editStudentById();
                    break;
                case 3:
                    deleteStudentById();
                    break;
                case 4:
                    sortStudentByGPA();
                    break;
                case 5:
                    sortStudentByName();
                    break;
                case 6:
                    displayStudent();
                    break;
                case 7:
                    saveFile();
                    break;
                case 8:
                    readFile();
                    break;
                case 9:
                    System.out.println("Thoát!!!");
                    break;
                default:
                    System.out.println("Nhập sai!!!");
            }

        }while (choose != 9);
    }

    private static void inputStudent() {
        System.out.println("Nhap so sinh vien can them");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++){
            Student std = new Student();
            std.input();

            studentList.add(std);
        }
    }

    private static void editStudentById() {
        System.out.println("Nhap id can sua");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student student : studentList){
            if(student.getId() == id){
                student.input();
                break;
            }
        }
    }

    private static void deleteStudentById() {
        System.out.println("Nhap id can xoa");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student student : studentList){
            if(student.getId() == id){
                studentList.remove(student);
                break;
            }
        }
    }

    private static void sortStudentByGPA() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() > o2.getGpa()){
                    return -1;
                }
                return 1;
            }
        });
    }

    private static void sortStudentByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -o1.getName().compareToIgnoreCase(o2.getName());
                //A-Z
            }
        });
    }

    private static void displayStudent() {
        for (Student student : studentList){
            student.display();
        }
    }

    private static void saveFile() {
        System.out.println("Bat dau luu");

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("student.txt", true);

            //luu du lieu
            for(Student student : studentList){
                String line = student.getFileLine();
                //chuyen String -> byte
                byte[] b = line.getBytes(StandardCharsets.UTF_8);
                //Save
                fos.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readFile() {
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            fis = new FileInputStream("student.txt");
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(reader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                if (line.isEmpty()){
                    continue;
                }
                Student std = new Student();
                std.parse(line);

                studentList.add(std);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void showMenu(){
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Sửa sinh viên theo id");
        System.out.println("3. Xoá sinh viên theo id");
        System.out.println("4. Sắp xếp theo GPA");
        System.out.println("5. Sắp xếp theo tên");
        System.out.println("6. Hiển thị thông tin sinh viên");
        System.out.println("7. Lưu vào file student.txt");
        System.out.println("8. Đọc nội dung sinh viên từ student.txt");
        System.out.println("9. Thoát");
        System.out.println("Chọn");
    }
}
