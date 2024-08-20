package edu.iuh.fit;

public class TestCourse {
    public static void main(String[] args) {

        CourseList courseList = new CourseList(10);

        Course c1 = new Course("CS101","Java Programing",3,"FIT");

        Course c2 = new Course("DS101","Python Programing",3,"FIT");

        Course c3 = new Course("CS102","Java Programing",3,"FIT");



        courseList.addCourse(c1);
        courseList.addCourse(c2);

        for(Course c: courseList.getCourses()){
            if(c != null) //stops printing when no courses left in the list
                System.out.println(c.getId() + " - " + c.getTitle());
        }

    }
}
