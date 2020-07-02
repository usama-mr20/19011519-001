package edu.uog.item;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Add_newPatient {

    Patient patientx = new Patient();
    Scanner scan = new Scanner(System.in);

    ShowPatients showPatients = new ShowPatients();



    public Patient Save (Patient patient){
        String line;

        FileWriter fileWriter;
        List<Patient> patients = showPatients.ShowAll();

        try {
            fileWriter = new FileWriter(Patient.csvFile);

            for (int i=0; i<patients.size(); i++) {
                fileWriter.append(patients.get(i).toString());
                fileWriter.append("\n");}

            if (patients.size()>0) {
                patient.setPATIENT_ID(patients.get(patients.size()-1).getPATIENT_ID()+1);
            }
            else
                patient.setPATIENT_ID(1);
            fileWriter.append(patient.toString());
            fileWriter.append("\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


        return patient;
    }



    public void add_newPatient(){

        System.out.println("----Adding A New Patient----");
        System.out.println("Enter The Name Of Patient:");
        patientx.setNEW_PATIENT_NAME(scan.nextLine());

        System.out.println("Enter The Description Of Patient:");
        patientx.setNEW_PATIENT_DESC(scan.nextLine());

        System.out.println("Enter The fee Of Patient:");
        patientx.setNEW_PATIENT_FEE(scan.nextInt());

        System.out.println("Enter The weight Of Patient:");
        patientx.setNEW_PATIENT_WEIGHT(scan.nextInt());

        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Enter The height Of Patient:");
        patientx.setNEW_PATIENT_HEIGHT(scan.nextLine());


        patientx.setPATIENT_NAME(patientx.getNEW_PATIENT_NAME());
        patientx.setPATIENT_DESC(patientx.getNEW_PATIENT_DESC());
        patientx.setPATIENT_FEE(patientx.getNEW_PATIENT_FEE());
        patientx.setPATIENT_WEIGHT(patientx.getNEW_PATIENT_WEIGHT());
        patientx.setPATIENT_HEIGHT(patientx.getNEW_PATIENT_HEIGHT());
        patientx = Save(patientx);

        System.out.println("\n--Following Patient Has Been Added To Record--\n");
        System.out.println("__________________________________________________");
        System.out.println(patientx.toString());
        System.out.println("__________________________________________________");

    }
}
