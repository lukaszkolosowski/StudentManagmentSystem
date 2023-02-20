package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 500;
    private static int id = 1000;

    Scanner in = new Scanner(System.in);

    //Constructor: prompt user to enter student's name and year
    public Student() {

        System.out.println("Enter student first name:");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name:");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level:\n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior");
        this.gradeYear = in.nextLine();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    //Generate an ID
    private void setStudentID() {
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses += "\n" + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    }

    //View balance

    //Pay tuition

    //Show status
}
