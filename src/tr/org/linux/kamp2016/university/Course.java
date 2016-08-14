package tr.org.linux.kamp2016.university;

import java.util.ArrayList;

public class Course {
	
	private Department department;
    private ArrayList<Student> registeredStudents = new ArrayList<Student>();
    private String name;
    private String instructorName;

    public Course(String name, String instrName, Department dept) {
        this.name = name;
        instructorName = instrName;
        department = dept;
    }

    public String toString() {
        String temp = "Name: " + name + "\n";
        temp += "Instructor: " + instructorName + "\n";
        temp += "Department: " + department.getDeptName() +"\n";
        temp += "Students registered: \n";

        for(Student st: registeredStudents) {
            temp += "  " + st.getID() + " " + st.getName() + "\n";
        }
        return temp;
    }

    public void registerStudent(Student st) {
        registeredStudents.add(st);
        department.appendStudent(st); 
    }

    public ArrayList<Student> getRegisteredStudents() {

        return registeredStudents;
    }

    public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Department getDepartment() {
        return department;
    }
}



