package edu.uog.teacher;

import edu.uog.course.courseData;

import java.util.List;
import java.util.Scanner;

public class TeacherCourseInterface {

	public static void TeacherCourseMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("======================================================");
			System.out.println("                  TeacherCourses Menu                         ");
			System.out.println("======================================================");
			System.out.println("1.  Show All TeacherCourses Data");
			System.out.println("2.  Insert TeacherCourse Row");
			System.out.println("3.  Search TeacherCourses By TeacherCourse-ID");
			System.out.println("4.  Search TeacherCourses By TeacherCourse Name");
			System.out.println("5.  Delete TeacherCourse By TeacherCourse-ID");
			System.out.println("6.  Delete All TeacherCourses Data");
			System.out.println("7.  Quit TeacherCourse");;
			System.out.print("Enter Your Choice [1-7]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			  case 1:
				System.out.println("*********************************");
				System.out.println("      All TeacherCourses Data       ");
				System.out.println("*********************************");
				List<TeacherCourse> teachercourse1 = teacherCourseData.findAll();
				for (int i=0; i<teachercourse1.size(); i++) 
				    {    System.out.println(teachercourse1.get(i).toString()); 
				    
				    }
			    System.out.println("*********************************");
				break;
			 case 2:
				System.out.println("*********************************");
				System.out.println("     Insert TeacherCourse Row          ");
				System.out.println("*********************************");
				TeacherCourse teachercourse2 = new TeacherCourse();
				System.out.print("Enter Teacher ID: ");
				int teacherid = scan.nextInt();
				teachercourse2.setTEACHER_ID(teacherData.findOne(teacherid));
				
				System.out.print("Enter Course ID: ");
				int courseid = scan.nextInt();
				teachercourse2.setCOURSE_ID(courseData.findOne(courseid));
				System.out.print("Enter Section: ");
				String type = scan.nextLine();
				type+=scan.nextLine();
				teachercourse2.setSECTION(type);
				
				teachercourse2 = teacherCourseData.Save(teachercourse2);
				System.out.println(teachercourse2.toString());
				System.out.println("*********************************");
				break;
			case 3:
				System.out.println("*********************************");
				System.out.println("       Search By TeacherCourse ID         ");
				System.out.println("*********************************");
				System.out.print("Enter search: ");
				teacherCourseData teachercoursedata3 = new teacherCourseData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 TeacherCourse teachercourse3 = teacherCourseData.findOne(x1);
				 System.out.println(teachercourse3.toString());
				 System.out.println("*********************************");
				break;
			case 4:
				System.out.println("*********************************");
				System.out.println("    Search TeacherCourse By TeacherCourse Name    ");
				System.out.println("*********************************");
				System.out.print("Enter search: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				teacherCourseData teachercoursedata4 = new teacherCourseData();
				List<TeacherCourse> teachercourse4 = teacherCourseData.findAll();
				teachercourse4= teachercoursedata4.search(x2);
				for (int i=0; i<teachercourse4.size(); i++)	
				    {    System.out.println(teachercourse4.get(i).toString());    }
				System.out.println("*********************************");
				break;
			case 5:
				System.out.println("*********************************");
				System.out.println("      Delete TeacherCourse By ID          ");
				System.out.println("*********************************");
				System.out.print("Enter TeacherCourse ID: ");
				int delete = scan.nextInt();
				TeacherCourse teachercourse5 = teacherCourseData.DelOne(delete);
				System.out.println(teachercourse5.toString());
				System.out.println("*********************************");
				break;
			case 6:
				System.out.println("*********************************");
				System.out.println("      Delete All TeacherCourses           ");
				System.out.println("*********************************");
				String teachercourse6 = teacherCourseData.DelAll();
			      System.out.println(teachercourse6); 
				break;
			case 7:
				System.out.println("*********************************");
				System.out.println("             Quit                ");
				System.out.println("*********************************");
				System.exit(0);
				break;
			}
		}
	}
}
