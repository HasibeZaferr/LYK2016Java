package tr.org.linux.kamp2016.university;

public class UniversityTest {
	

    public static void main(String[] args) {

        Student s1 = new Student("EDİP", "04500", "Spring", 2007);
        Student s2 = new Student("CEMAL", "04111", "Fall", 2014);
        Student s3 = new Student("TURGUT", "04569", "Summer", 2015);
        Student s4 = new Student("TOMRİS", "04991", "Fall", 2014);

        Department dept = new Department("Computer Science.", "Sci");

        Course course = new Course("Java Programming Language", "Hakan Uygun",dept) ;

        course.registerStudent(s1);
        course.registerStudent(s2);
        course.registerStudent(s3);
        course.registerStudent(s4);

        System.out.println(course);

        System.out.println(dept);


    }


}
