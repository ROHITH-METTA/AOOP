package com.sis;

import java.util.ArrayList;
import java.util.List;

public class CourseImpl implements Course {
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public CourseImpl(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }
}
