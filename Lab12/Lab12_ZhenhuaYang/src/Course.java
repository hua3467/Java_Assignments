/**
 *
 * @author aaronyang
 */
public class Course {
    
    // Create instence variables
    private int courseID;
    private String courseName;
    private int credits;
    private String instructorName;
    /**
     * overloaded constructor
     * @param id is new course ID 
     * @param name is new course name
     * @param credt is credits of the course
     * @param instructor is the name of the instructor
     */
    public Course( int id, String name, int credt, String instructor ){
        courseID = id;
        courseName = name;
        credits = credt;
        instructorName = instructor;
    }
    
    // accessor methods
    
    /**
     * 
     * @return course ID
     */
    public int getCourseID(){
        return courseID;
    }/**
     * 
     * @return courseName
     */
    public String getCourseName(){
        return courseName;
    }
    /**
     * 
     * @return credits
     */
    public int getCredits(){
        return credits;
    }
    /**
     * 
     * @return instructor name
     */
    public String getInstructorName(){
        return instructorName; 
    }
    
    @Override
    public String toString(){
        
        return "\nCourse ID: " + courseID 
                + "\nCourse Name: " + courseName
                + "\nCredits: " + credits
                + "\nInstructor Name: " + instructorName;
    }
    
    @Override
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
