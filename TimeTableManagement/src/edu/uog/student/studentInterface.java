package edu.uog.student;

import java.util.List;
import java.util.Scanner;

public class studentInterface {


    public static void StudentMenu() {


        Scanner scan = new Scanner(System.in);
        int choice;

        choice = -1;
        while (choice!=10) {
            System.out.println("=====================================================");
            System.out.println("Students Menu");
            System.out.println("=====================================================");
            System.out.println("1.   Insert Student");
            System.out.println("2.   Delete A Student By ID");
            System.out.println("3.   Show All Student Data");
            System.out.println("4.   Search A Student By ID");
            System.out.println("5.   Delete All Student Data");
            System.out.println("10.   Back To Main Menu");
            System.out.print("Enter Your Choice [1-10]: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Add New Student");
                    System.out.println("---------------------------------");
                    Student st = new Student();

//                    System.out.println("Enter Student Title: ");
//                    String Title = scan.nextLine();
//                    Title+=scan.nextLine();
//                    room.setTITLE(Title);



                    System.out.println("Enter Roll Number: ");
                    String R_no = scan.nextLine();
                    R_no+=scan.nextLine();
                    st.setSTUDENT_ROLLNO(R_no);

                    System.out.println("Enter Program: ");
                    String Program = scan.nextLine();
                    st.setSTUDY_PROGRAM(Program);


                    System.out.println("Enter Year: ");
                    String year = scan.nextLine();
                    st.setSTUDY_YEAR(year);



                    st = studentData.Save(st);
                    System.out.println(st.toString());
                    System.out.println("---------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Delete Student Row");
                    System.out.println("---------------------------------");
                    System.out.println("Enter Student ID: ");
                    int Student_ID = scan.nextInt();

                    Student studentdelete = studentData.deleteOne(Student_ID);
                    System.out.println(studentdelete.toString());
                    System.out.println("---------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("Show All Student Data");
                    System.out.println("---------------------------------");
                    List<Student> Students = studentData.findAll();
                    for (int i=0; i<Students.size(); i++) {
                        System.out.println(Students.get(i).toString());
                    }
                    System.out.println("---------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("Search Students");
                    System.out.println("---------------------------------");
                    System.out.println("Enter Student  ID: ");
                    String search = scan.nextLine();
                    search+=scan.nextLine();
                    List<Student> studentsearch = studentData.search(search);
                    for (int i=0; i<studentsearch.size(); i++) {
                        System.out.println(studentsearch.get(i).toString());
                    }
                    System.out.println("---------------------------------");

                    break;
                case 5:
                    studentData.deleteAll();
                    break;


                case 10:
                    break;
            }
        }
    }

}
