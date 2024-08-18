package com.sis;

import java.util.List;

public interface Course {
    String getCourseId();
    String getCourseName();
    List<Student> getEnrolledStudents();
    void enrollStudent(Student student);
}
