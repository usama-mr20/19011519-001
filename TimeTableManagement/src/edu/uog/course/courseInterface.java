package edu.uog.course;


import java.util.List;
import java.util.Scanner;

public class courseInterface {

    public static void CourseMenu() {

        Scanner scan = new Scanner(System.in);
        int choice=-1;

        choice = -1;
        while (choice!=10) {
            System.out.println("=====================================================");
            System.out.println("Course Menu");
            System.out.println("=====================================================");
            System.out.println("1.   Insert New Course");
            System.out.println("2.   Delete A Course");
            System.out.println("3.   Show All Courses");
            System.out.println("4.   Search A Course");
            System.out.println("5.   Delete All Courses");
            System.out.println("10.   Back To Main Menu");
            System.out.print("Enter Your Choice [1-10]: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Add New Course");
                    System.out.println("---------------------------------");
                    Course course = new Course();

                    System.out.println("Enter Course Name: ");
                    String name = scan.nextLine();
                    name+=scan.nextLine();
                    course.setCOURSE_TITLE(name);

                    System.out.println("Enter Course Code: ");
                    String courseCode = scan.nextLine();
                    courseCode+=scan.nextLine();
                    course.setCOURSE_CODE(courseCode);

                    System.out.println("Enter Course Credit Hours: ");
                    int creditHr = scan.nextInt();
                    course.setCOURSE_CREDITHOUR(creditHr);

                    System.out.println("Enter Course Desc: ");
                    String Desc = scan.nextLine();
                    Desc+=scan.nextLine();
                    course.setCOURSE_DESC(Desc);

                    System.out.println("Enter Course PreRequisite ID: ");
                    int preRequsiteID = scan.nextInt();
                    if (preRequsiteID != 0) {

                        Course ID = courseData.findOne(preRequsiteID);
                        course.setCOURSEPRERQUIST_ID(ID);
                    }
                    else{
                        Course ID2 = null;
                        course.setCOURSEPRERQUIST_ID(ID2);
                    }

                    course = courseData.Save(course);
                    System.out.println(course.toString());
                    System.out.println("---------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Delete A Course");
                    System.out.println("---------------------------------");
                    System.out.println("Enter Course ID: ");
                    int course_ID = scan.nextInt();

                    Course coursedelete = courseData.deleteOne(course_ID);
                    System.out.println(coursedelete.toString());
                    System.out.println("---------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("Show All Courses Data");
                    System.out.println("---------------------------------");
                    List<Course> courses = courseData.findAll();
                    for (int i=0; i<courses.size(); i++) {
                        System.out.println(courses.get(i).toString());
                    }
                    System.out.println("---------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("Search Course By ID");
                    System.out.println("---------------------------------");
                    System.out.println("Enter ID: ");
                    String search = scan.nextLine();
                    search+=scan.nextLine();
                    List<Course> coursesearch = courseData.search(search);
                    for (int i=0; i<coursesearch.size(); i++) {
                        System.out.println(coursesearch.get(i).toString());
                    }
                    System.out.println("---------------------------------");

                    break;

                case 5:
                    courseData.deleteAll();
                    break;
                case 10:
                    break;
            }
        }
    }
}
