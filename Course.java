import java.nio.channels.NonWritableChannelException;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName=courseName;
    }
    public void addStudents(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public Object clone(){
        try{
            Course newCourse = (Course)super.clone();
            newCourse.students = (String[])students.clone();
            return newCourse;
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }

    public static void main(String[] args){
        Course course1 = new Course("Java");
        Course course2 = (Course)course1.clone();
        System.out.println(course1 == course2?true:false);
        System.out.println(course1.students == course2.students?true:false);
    }

}
