package edu.uog.teacher;

import edu.uog.person.Person;
import edu.uog.person.personData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class teacherData {


    Person person = new Person();
    public static String csvFile5 ="C:\\Users\\Muhammad Awais\\Desktop\\Teachers.csv";


    public static String getCsvFile5() {
        return csvFile5;
    }

    public static void setCsvFile5(String csvFile5) {
        teacherData.csvFile5 = csvFile5;
    }

    @SuppressWarnings("resource")
    public static List<Teacher> findAll()
    {
        List<Teacher> teachers = new ArrayList<Teacher>();
        String line;
        try
        {
            BufferedReader buffereader = new BufferedReader(new FileReader(csvFile5 ));
            while ((line = buffereader.readLine()) != null)
            {
                Teacher teacher=new Teacher();
                String[] teacherRow = line.split(",");
                teacher.setTEACHER_ID(Integer.parseInt(teacherRow[0]));
                teacher.setTEACHER_NAME(teacherRow[1]);
                teacher.setTITLE(teacherRow[2]);
                teacher.setPERSON_ID(Integer.parseInt(teacherRow[3]));
                Person person =personData.findOne(Integer.parseInt(teacherRow[3]));
                teacher.setFORE_NAME(person.getFORE_NAME());
                teacher.setSUR_NAME(person.getSUR_NAME());
                teacher.setGENDER(person.getGENDER());
                teacher.setADDRESS(person.getADDRESS());



                teachers.add(teacher);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return teachers;
    }

    public static Teacher findOne(int teacher_ID)
    {
        String line;
        try
        {
            BufferedReader buffereader = new BufferedReader(new FileReader(csvFile5));
            while ((line = buffereader.readLine()) != null)
            {
                Teacher teacher=new Teacher();

                String[] teacherRow = line.split(",");
                if(Integer.parseInt(teacherRow[0]) == teacher_ID) {
                    teacher.setTEACHER_ID(Integer.parseInt(teacherRow[0]));
                    teacher.setTEACHER_NAME(teacherRow[1]);
                    teacher.setTITLE(teacherRow[2]);
                    teacher.setPERSON_ID(Integer.parseInt(teacherRow[3]));
                    Person person = personData.findOne(Integer.parseInt(teacherRow[3]));
                    teacher.setFORE_NAME(person.getFORE_NAME());
                    teacher.setSUR_NAME(person.getSUR_NAME());
                    teacher.setGENDER(person.getGENDER());
                    teacher.setADDRESS(person.getADDRESS());

                    return teacher;
                }

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
    public static List<Teacher> search(String TEACHER_NAME)
    {
        List<Teacher> teachers = new ArrayList<Teacher>();
        String line;

        try
        {
            BufferedReader buffereader = new BufferedReader(new FileReader(csvFile5));
            while ((line = buffereader.readLine()) != null)
            {
                Teacher teacher=new Teacher();
                String[] teacherRow = line.split(",");
                if(teacherRow[1].contains(TEACHER_NAME)== true) {
                    teacher.setTEACHER_ID(Integer.parseInt(teacherRow[0]));
                    teacher.setTEACHER_NAME(teacherRow[1]);
                    teacher.setTITLE(teacherRow[2]);
                    teacher.setPERSON_ID(Integer.parseInt(teacherRow[3]));
                    Person person =personData.findOne(Integer.parseInt(teacherRow[3]));
                    teacher.setFORE_NAME(person.getFORE_NAME());
                    teacher.setSUR_NAME(person.getSUR_NAME());
                    teacher.setGENDER(person.getGENDER());
                    teacher.setADDRESS(person.getADDRESS());


                    teachers.add(teacher);
                }

            }}

        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return teachers ;

    }


    public static Teacher Save(Teacher teacher)
    {
        FileWriter filewriter;
        List<Teacher>teachers = findAll();
        try
        {
            filewriter = new FileWriter(csvFile5 = csvFile5);
            for(int i=0; i<teachers.size(); i++)
            {
                filewriter.append(teachers.get(i).toString());
                filewriter.append("\n");
            }
            if(teachers.size()>0)
            {  teacher.setTEACHER_ID(teachers.get(teachers.size()-1).getTEACHER_ID()+1);  }
            else
            {  teacher.setTEACHER_ID(1);  }
            filewriter.append(teacher.toString());
            filewriter.append("\n");
            filewriter.flush();
            filewriter.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return teacher;
    }
    public static Teacher DelOne(int Teacher_ID) {
        FileWriter fileWriter;
        List<Teacher> Teacher=findAll();
        Teacher teacher=teacherData.findOne(Teacher_ID);

        try {
            fileWriter=new FileWriter(csvFile5);

            for(int i=0;i<Teacher.size();i++) {
                if(Teacher.get(i).getTEACHER_ID()!=Teacher_ID) {
                    fileWriter.append(Teacher.get(i).toString());
                    fileWriter.append("\n");
                }
            }

            Teacher.add(teacher);
            fileWriter.flush();
            fileWriter.close();

            return teacher;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return teacher;
    }
    public static List<Teacher> DelAll() {
        FileWriter filewriter;
        List<Teacher> teacher=findAll();
        try {
            filewriter=new FileWriter(csvFile5);
            for(int i=0;i<teacher.size();i++) {
                teacher.remove(i);
            }
            filewriter.flush();
            filewriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return teacher;

    }

}
