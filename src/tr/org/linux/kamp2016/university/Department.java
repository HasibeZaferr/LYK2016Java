package tr.org.linux.kamp2016.university;

import java.util.ArrayList;


public class Department {

    private String deptName;

    private String facultyName;

    private ArrayList<Student> students = new ArrayList<Student>();

   
    public Department(String deptName, String facultyName) {
        this.deptName = deptName;
        this.facultyName = facultyName;
    }


    public void appendStudent(Student st) {
        students.add(st);
    }

   
    public String toString() {
        String temp = "Department: " + getDeptName();
        temp += "\nFaculty: " + getFacultyName() +"\n";

        for(Student st : students) {
            temp += st.toString();
        }

        return temp;
    }


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }


}