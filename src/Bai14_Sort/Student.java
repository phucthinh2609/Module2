package Bai14_Sort;

class Student {

    private String firstName;

    private String lastName;

    private int age;

    public Student(String fName, String lName, int age) {

        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }

    public void printStudentDetails() {
        System.out.print("First Name: " + firstName);
        System.out.print(", Last Name: " + lastName);
        System.out.println(", Age: " + age);
    }

    public String getLastName() {
        return lastName;
    }

}

class StudentsArrayInObj {

    private Student[] studentsArray;

    private int nElements;

    public StudentsArrayInObj(int max) {
        //create student array
        studentsArray = new Student[max];

        // no elements yet in the array
        nElements = 0;
    }

    public void insert(String fName, String lName, int age) {
        studentsArray[nElements] = new Student(fName, lName, age);

        nElements++;

    }

    public void printStudentsArrayElements() {
        for (int i = 0; i < nElements; i++) {
            studentsArray[i].printStudentDetails();
        }
    }

    public void doInsertionSort() {

        int in, out;

        for (out = 1; out < nElements; out++) {
            Student temp = studentsArray[out];
            in = out;

            while (in > 0 && studentsArray[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                studentsArray[in] = studentsArray[in - 1];
                --in;
            }
            studentsArray[in] = temp;
        }
    }
}

class SortObjectsInsertionSortExample {

    public static void main(String[] args) {
        //create student array
        StudentsArrayInObj studArray = new StudentsArrayInObj(10);

        //insert items
        studArray.insert("John", "Smith", 15);
        studArray.insert("Ram", "Kumar", 11);
        studArray.insert("Mohan", "Prakash", 14);
        studArray.insert("Paul", "John", 16);

        //display items
        System.out.println("Before sorting student objects");
        studArray.printStudentsArrayElements();

        //insertion sort
        studArray.doInsertionSort();

        //display items after sorting using insertion sort
        System.out.println("After sorting student objects");
        studArray.printStudentsArrayElements();

    }

}
