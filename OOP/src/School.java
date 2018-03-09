import java.util.LinkedList;

public class School {
    private static School school = null;
    private static LinkedList<Teacher> teachers;
    private static LinkedList<Student> students;

    public School() {
        teachers = new LinkedList<>();
        students = new LinkedList<>();
    };

    public static School getSchool() {
        if (school == null) {
            school = new School();
        }
        return school;
    };

    public void addTeacher(Teacher newTeacher) {
        school.teachers.add(newTeacher);
    };

    public void addStudent(Student newStudent) {
        school.students.add(newStudent);
    };

    public void getStudents() {
        for (Student student : this.students) {
            System.out.println("Name: "  + student.getStudentName() + ", age: " +  student.getStudentAge());
        };
    };
};
