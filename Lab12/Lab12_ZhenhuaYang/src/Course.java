/**
 *
 * @author aaronyang
 */
public class Course {
    
    private int courseID;
    private String courseName;
    private int credits;
    private String instructorName;
    
    public Course( int id, String name, int credt, String instructor ){
        courseID = id;
        courseName = name;
        credits = credt;
        instructorName = instructor;
    }
    
    public int getCourseID(){
        return courseID;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getGredits(){
        return credits;
    }
    public String getInstructorName(){
        return instructorName; 
    }
    
    public String toString(){
        
        return "\nCourse ID: " + courseID 
                + "\nCourse Name: " + courseName
                + "\nCredits: " + credits
                + "\nInstructor Name: " + instructorName;
    }
    
    public boolean equals( Object o ){
        if ( ! ( o instanceof Course))
            return false;
        else{
            Course objCourse = ( Course )o;
            return courseID == objCourse.courseID && courseName == objCourse.courseName
                    && credits == objCourse.credits && instructorName == objCourse.instructorName;
        }
    }
    
}
