package edu.uog.teacher;

import edu.uog.course.courseData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class teacherCourseData {


    @SuppressWarnings("resource")
    public static List<TeacherCourse> findAll()
    {
        List<TeacherCourse> teachercourses = new ArrayList<TeacherCourse>();
        String line;
        try
        {
            BufferedReader buffereader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
            while ((line = buffereader.readLine()) != null)
            {
                TeacherCourse teachercourse=new TeacherCourse();
                String[] teachercourseRow = line.split(",");
                teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourseRow[0]));
                teachercourse.setTEACHER_ID(teacherData.findOne(Integer.parseInt(teachercourseRow[1])));
                teachercourse.setCOURSE_ID(courseData.findOne(Integer.parseInt(teachercourseRow[2])));
                teachercourse.setSECTION(teachercourseRow[3]);

                teachercourses.add(teachercourse);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return teachercourses;
    }

    public static TeacherCourse findOne(int teachercourse_ID)
    {
        String line;
        try
        {
            BufferedReader buffereader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
            while ((line = buffereader.readLine()) != null)
            {
                TeacherCourse teachercourse=new TeacherCourse();

                String[] teachercourseRow = line.split(",");
                teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourseRow[0]));
                teachercourse.setTEACHER_ID(teacherData.findOne(Integer.parseInt(teachercourseRow[1])));
                teachercourse.setCOURSE_ID(courseData.findOne(Integer.parseInt(teachercourseRow[2])));
                teachercourse.setSECTION(teachercourseRow[3]);
                return teachercourse;


            }
        }
        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return null;

    }
    @SuppressWarnings({ "resource" })
    public List<TeacherCourse> search(String search)
    {
        List<TeacherCourse> teachercourses = new ArrayList<TeacherCourse>();
        String line;

        try
        {
            BufferedReader buffereader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
            while ((line = buffereader.readLine()) != null)
            {
                TeacherCourse teachercourse=new TeacherCourse();
                String[] teachercourseRow = line.split(",");
                teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourseRow[0]));
                teachercourse.setTEACHER_ID(teacherData.findOne(Integer.parseInt(teachercourseRow[1])));
                teachercourse.setCOURSE_ID(courseData.findOne(Integer.parseInt(teachercourseRow[2])));
                teachercourse.setSECTION(teachercourseRow[3]);
                teachercourses.add(teachercourse);
            }

        }

        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return teachercourses ;

    }


    public static TeacherCourse Save(TeacherCourse teachercourse)
    {
        FileWriter filewriter;
        List<TeacherCourse>teachercourses = findAll();
        try
        {
            filewriter = new FileWriter(TeacherCourse.csvFile);
            for(int i=0; i<teachercourses.size(); i++)
            {
                filewriter.append(teachercourses.get(i).toString());
                filewriter.append("\n");
            }
            if(teachercourses.size()>0)
            {  teachercourse.setTEACHERCOURSE_ID(teachercourses.get(teachercourses.size()-1).getTEACHERCOURSE_ID()+1);  }
            else
            {  teachercourse.setTEACHERCOURSE_ID(1);  }
            filewriter.append(teachercourse.toString());
            filewriter.append("\n");
            filewriter.flush();
            filewriter.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return teachercourse;
    }
    public static String DelAll()
    {
        FileWriter filewriter;
        List<TeacherCourse> teachercourses = findAll();
        try
        {
            filewriter = new FileWriter(TeacherCourse.csvFile);

            for(int i=0;i<teachercourses.size();i++)
            {
                teachercourses.remove(i);
            }
            filewriter.flush();
            filewriter.close();
        }
        catch (IOException e)
        {
            System.out.println("CSV File cannot be Read!" +e);
            e.printStackTrace();
        }
        return "Removed Successfully";
    }
    public static TeacherCourse DelOne(int teachercourse_ID)
    {
        FileWriter filewriter;
        List<TeacherCourse> teachercourses = findAll();
        TeacherCourse teachercourse = teacherCourseData.findOne(teachercourse_ID);
        try
        {
            filewriter = new FileWriter(TeacherCourse.csvFile);
            for(int i=0;i<teachercourses.size();i++)
            {
                if(teachercourses.get(i).getTEACHERCOURSE_ID()!=teachercourse_ID)
                {
                    filewriter.append(teachercourses.get(i).toString());
                    filewriter.append("\n");
                }
            }
            filewriter.flush();
            filewriter.close();
        }
        catch (IOException e)
        {
            System.out.println("CSV File cannot be Read!" +e);
            e.printStackTrace();
        }
        return teachercourse;
    }
}
