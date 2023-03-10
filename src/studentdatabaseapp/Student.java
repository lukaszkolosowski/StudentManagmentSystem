package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
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
                courses += "\n " + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance + " PLN");
    }

    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: PLN");
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of PLN " + payment);
        viewBalance();
        System.out.println();
    }

    //Show status
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\n1. Grade level: " + gradeYear +
                "\n2. Student ID: " + studentID +
                "\n3. Courses enrolled: " + courses +
                "\n4. Balance: PLN " + tuitionBalance;
    }
}
