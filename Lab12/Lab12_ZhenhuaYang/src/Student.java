/**
 *
 * @author aaronyang
 */
public class Student {
    
    // instence variables
    private int studentID = nextID;
    private String name;
    private double gpa;
    private char gender;
    private Course[] courseList;
    static int nextID = 1000;
    /**
     * overloaded constructor
     * @param n is the String will be assigned to name 
     * @param g is the double will be assigned to gpa
     * @param gen is the char will be assigned to gender
     * @param c is the array of object Course to be assigned to courseList
     */
    public Student( String n, double g, char gen, Course[] c ){
        name = n;
        gpa = g;
        gender = gen;
        courseList = c;
        nextID ++;
    }
    
    // accessor methods
    /**
     * 
     * @return student ID as int
     */
    public int getStudentID(){
        return studentID;
    }
    /**
     * 
     * @return Sting name
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @return double gpa
     */
    public double getGPA(){
        return gpa;
    }
    /**
     * 
     * @return char gender
     */
    public char getGender(){
        return gender;
    }
    /**
     * 
     * @return courseList
     */
    public Course[] getCourseList(){
        return courseList;
    }
    
    // mutator methods
    /**
     * 
     * @param n is the String to be assigned to name
     */
    public void setName( String n ){
        name = n;
    }
    /**
     * 
     * @param g is double to be assigned to gpa
     */
    public void setGPA( double g ){
        gpa = g;
    }
    /**
     * 
     * @param gen is char to be assigned to gender
     */
    public void setGender( char gen ){
        gender = gen;
    }
    /**
     * 
     * @param c is the Course array to be assigned to courseList
     */
    public void setCourseList( Course[] c ){
        courseList = c;
    }
    
    @Override
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
    
    /**
     *
     * @param o
     * @return
     */
    @Override
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
