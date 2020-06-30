package edu.uog;

import edu.uog.campus.roomInterface;
import edu.uog.course.courseInterface;
import edu.uog.person.personInterface;
import edu.uog.student.studentInterface;
import edu.uog.teacher.TeacherCourseInterface;
import edu.uog.teacher.TeacherInterface;

import java.util.Scanner;



public class TimeTableManagement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int choice=-1;
		
		while (choice!=10) {
			System.out.println("=====================================================");
			System.out.println("Main Menu");
			System.out.println("=====================================================");
			System.out.println("1.   Rooms Data");
			System.out.println("2.   Courses Data");
			System.out.println("3.   Persons Data");
			System.out.println("4.   Student Data");
			System.out.println("5.   Teacher Data");
			System.out.println("6.   Teacher-Course Data");
			System.out.println("7.   Student-Course Data");
			System.out.println("8.   Time-Slot Data");
			System.out.println("9.   Week-Day Data");
			System.out.println("10.   Quit");
			System.out.println("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();
	
			switch (choice) {
				case 1:
					roomInterface.RoomManu();
					choice=-1;
					break;
				case 2:
					courseInterface.CourseMenu();
					choice=-1;
					break;
				case 3:
					personInterface.PersonManu();
					break;
				case 4:
					studentInterface.StudentMenu();
					break;
				case 5:
					TeacherInterface.TeacherMenu();
					break;
				case 6:
					TeacherCourseInterface.TeacherCourseMenu();
					break;
				case 10:
					break;
				default:
					System.out.println("Invalid Choice!");
			}
		}

	}
}
