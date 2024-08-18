package com.sis;

public class Client {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Create courses
        Course course1 = new CourseImpl("C001", "Mathematics");
        Course course2 = new CourseImpl("C002", "Science");

        // Create enrollment manager
        EnrollmentManager enrollmentManager = new EnrollmentManager();

        // Enroll students in courses
        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student2, course2);
        enrollmentManager.enrollStudentInCourse(student1, course2);

        // Display student enrollments
        System.out.println(student1.getName() + " is enrolled in: ");
        for (Course course : student1.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }

        System.out.println(student2.getName() + " is enrolled in: ");
        for (Course course : student2.getCourses()) {
            System.out.println("- " + course.getCourseName());
        }

        // Display course enrollments
        System.out.println(course1.getCourseName() + " has enrolled students: ");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println("- " + student.getName());
        }

        System.out.println(course2.getCourseName() + " has enrolled students: ");
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
