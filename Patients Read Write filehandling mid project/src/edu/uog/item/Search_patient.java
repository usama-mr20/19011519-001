package edu.uog.item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search_patient {

    Scanner scan = new Scanner(System.in);


    Patient search_patient = new Patient();

    public Patient SearchBy_ID(int patient_ID){
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Patient.csvFile));

            while ((line = bufferedReader.readLine()) !=null){
                Patient patient = new Patient();
                String[] patientRow = line.split(",");

                if(Integer.parseInt(patientRow[0])==patient_ID) {

                    patient.setPATIENT_ID(Integer.parseInt(patientRow[0]));
                    patient.setPATIENT_NAME(patientRow[1]);
                    patient.setPATIENT_DESC(patientRow[2]);
                    patient.setPATIENT_FEE(Integer.parseInt(patientRow[3]));
                    patient.setPATIENT_WEIGHT(Integer.parseInt(patientRow[4]));
                    patient.setPATIENT_HEIGHT(patientRow[5]);
                    return patient;
                }

            }
        } catch (IOException e) {
            System.out.println("An Error");
            e.printStackTrace();
        }

        return null;
    }


    public void SearchBy_ID(){
        System.out.println("-->Enter the ID of patient you want to search:");
        search_patient.setSearchedID(scan.nextInt());

        System.out.println("Patient searched by the given ID is below:");

        Patient patient = SearchBy_ID(search_patient.getSearchedID());
        System.out.println(patient.toString());
    }




    public List<Patient> search(String search){
        List<Patient> patients = new ArrayList<Patient>();
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Patient.csvFile));

            while ((line = bufferedReader.readLine()) !=null){
                Patient patient = new Patient();
                String[] patientRow = line.split(",");

                if(patientRow[1].contains(search)==true) {

                    patient.setPATIENT_ID(Integer.parseInt(patientRow[0]));
                    patient.setPATIENT_NAME(patientRow[1]);
                    patient.setPATIENT_DESC(patientRow[2]);
                    patient.setPATIENT_FEE(Integer.parseInt(patientRow[3]));
                    patient.setPATIENT_WEIGHT(Integer.parseInt(patientRow[4]));
                    patient.setPATIENT_HEIGHT(patientRow[5]);


                    patients.add(patient);
                }

            }
        } catch (IOException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }

        return patients;
    }




    public void SearchBy_Name(){


        System.out.println("-->Enter the Name of patient you want to search:");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        search_patient.setSearchedName(scan.nextLine());
        //scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Patient searched by the given Name is below:");
        System.out.println("---------------------------------------------");

        List<Patient> patients = search(search_patient.getSearchedName());
        for (int i=0; i<patients.size(); i++){
            System.out.println(patients.get(i).toString());
        }
        System.out.println("---------------------------------------------");


    }
}
