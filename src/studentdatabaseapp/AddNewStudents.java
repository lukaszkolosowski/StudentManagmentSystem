package studentdatabaseapp;

import java.util.Scanner;

public class AddNewStudents {

    private Student[] students;

    //    Ask how many new students we want to add
    public void howManyNewStudentsWeWantToAdd() {
        System.out.println("Enter number of new students to enroll: ");
        students = new Student[getNumberOfStudents()];

        // Create n number of new students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
            System.out.println();
        }
    }

    public int getNumberOfStudents() {
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        return numOfStudents;
    }

    @Override
    public String toString() {
        return "" + students;
    }
}
