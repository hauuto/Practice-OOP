package edu.iuh.fit;

public class CourseList {
    private Course[] courses;
    private static int count = 0;


    public CourseList(int size){
        if (size <= 0){
            throw new IllegalArgumentException("Size must be greater than 0");
        }
        courses = new Course[size];
    }
    public boolean addCourse(Course course){
        // Course != null, unique id, do not greater than length

        //Check if courses is null
        if (course == null){
            return false;
        }
        
        //Check if course already exists
        if (isExists(course)){
            return false;
        }
        // Check the Course list is full
        if (count < courses.length){
            courses[count++] = course;
            return true;
        }
        return false;
    }

    public Course[] getCourses() {
        return courses;
    }

    private boolean isExists(Course course) {
        for (int i = 0; i < courses.length; i++) {
            Course temp = courses[i];
            if(courses[i] != null && courses[i].getId().equalsIgnoreCase(course.getId())){
                return true;
            }
        }
        return false;
    }
}
