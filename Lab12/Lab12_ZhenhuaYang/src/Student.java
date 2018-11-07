/**
 *
 * @author aaronyang
 */
public class Student {
    
    private int studentID = nextID;
    private String name;
    private double gpa;
    private char gender;
    private Course[] courseList;
    static int nextID = 1000;
    
    public Student( String n, double g, char gen, Course[] c ){
        name = n;
        gpa = g;
        gender = gen;
        courseList = c;
        nextID ++;
    }
    
    public int getStudentID(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public double getGPA(){
        return gpa;
    }
    public char getGender(){
        return gender;
    }
    public Course[] getCourseList(){
        return courseList;
    }
    
    public void setName( String n ){
        name = n;
    }
    public void setGPA( double g ){
        gpa = g;
    }
    public void setGender( char gen ){
        gender = gen;
    }
    public void setCourseList( Course[] c ){
        courseList = c;
    }
    
    public String toString(){
        
        String courses = "";
        for( int i = 0; i < courseList.length; i++ ){
             courses += courseList[i].getCourseName() + "\n";
        }
        
        return "========Student Information======\n" + "\n-ID: " + studentID 
                + "\n-Name: " + name
                + "\n-GPA: " + gpa
                + "\n-Gener: " + gender
                + "\n-Course List:\n" + courses;
        
    }
    
    public boolean equals( Object o ){
        if( !( o instanceof Student ))
            return false;
        else{ 
            Student objStudent = (Student)o;
            return name == objStudent.name && gpa == objStudent.gpa 
                    && gender == objStudent.gender 
                    && courseList == objStudent.courseList;
        }
    }
    
}
